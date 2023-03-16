// 05-1.클래스와 객체
// 1★클래스 정의와 객체 생성
// 2★클래스 멤버 (필드, 메서드)
// 3★접근 제어자 (public, private, protected, default)
// 4★생성자 
// ----------------------------------------------------------------------------------------------------------------   
//1★클래스 정의와 객체 생성
// 클래스는 객체를 생성하기 위한 일종의 틀이다. 클래스를 정의하면 그 클래스에
// 객체를 생성할 수 있으며, 객체는 해당 클래스의 인스턴스이다. 
// 객체는 클래스에서 정의한 속성과 행위를 가지고 있다고 보면된다.

// 예를들어 학생을 나타내는 클래스를 정의해보자.

// 학생의 속성
// public class Student {
// public class studentID; //학번
// public String studentName; //이름
// public String address; //주소
// }

// 학생의 생성자
// public Student(int id, String name, String addr) {
// studentID = id;
// studentName = name;
// address = addr;    
//}

// 학생 정보를 출력하는 메서드
// public void showStudentInfo() {
// system.out.println("학번: " + studentID);    
// system.out.println("이름: " + studentName);    
// system.out.println("주소: " + address);    
//} 
// 위 클래스는 'studentID','studentName','address'는 학생의 속성을 나타내며,
// Student 클래스의 생성자와 showStudentInfo()는 학생의 행위를 나타낸다.

// 이제 student 클래스를 사용하여 객체를 생성해보자 .
// public class Main {
//      public static void main(String[] args) {

//          클래스의 인스턴스 생성
//          Student 1을 생성하고 생성자를 호출하여 인스턴스의 속성을 초기화한다.
//         Student student1 = new Student(20190001, "홍길동", "서울시 강남구");

//          학생 정보 출력
//         student1.showStudentInfo();
//     }
// }
// ----------------------------------------------------------------------------------------------------------------   

//2★클래스 멤버 (필드, 메서드)
// 필드란 클래스 내에서 정의된 변수를 필드(Field)라고 한다. 클래스 내에서 어떤 동작을 수행하기 
// 위해 필요한 데이터를 저장하는 역할을 한다. 필드는 접근 제어자를 사용하여, 외부접근 제한 가능
// 아래에서 자세히 살펴보자.
package basic_course;

    public class Basic05_1 {
        // 이 클래스는 반지름과 색상을 필드로 갖는다.
        // private으로 선언되어 있기 때문에 클래스 외부에서 직접 접근을 할 수 없다.
        // 대신 필드에 접근하기 위한 getter와 setter메서드를 제공한다.
        private double radius; // 반지름 필드
        private String color; // 색상 필드 

        // Basic05_1 클래스의 생성자.
        public Basic05_1(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        // 메서드 (Method)
        // 클래스 내에서 정의된 함수를 메서드(Method)라고 한다. 메서드는 필드에 
        // 저장된 데이터를 이용하여 클래스 내에서 특정한 동작을 수행하는 역할을 한다.
        // 메서드는 입력값을 받아 처리한 후, 결과값을 반환할 수도 있다.

         // 반지름 필드에 대한 getter 메서드
         public double getRadius() {
            return radius;
        }
        // 색상 필드에 대한 setter 메서드.
        public void setColor(String color) {
            this.color = color;
        }
        // 원의 넓이를 계산하는 메서드
        public double getArea() {
            return Math.PI * radius * radius;
        }
        // 원의 둘레를 계산하는 메서드
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
        // 색상 필드에 대한 getter 메서드 
        public String getColor() {
            return color;
        }
    }
// ----------------------------------------------------------------------------------------------------------------   
// 3★접근 제어자 (public, private, protected, default)
// 접근 제어자는 클래스, 필드, 메서드 등의 멤버에 대한 외부에서에 대한 접근을 제어하는 키워드,
// Java에서는 총 4가지가 있다.

// 1. public 
// -> 모든 클래스에서 접근 가능, 패키지 내/외부, 상속 관계 여부와 상관없이 어디서든 접근가능

// 2. protected
// -> 같은 패키지 내의 클래스나 해당 클래스를 상속받은 외부 패키지의 클래스 에서 접근 가능
// -> 외부 패키지의 클래스에서는 상속 관계일 때만 가능, 

// 3. default (package-private)
// -> 아무것도 없다는 뜻. 상속 관계라도 패키지가 다르면 접근 불가
// -> 같은 패키지 내의 클래스에서만 접근 가능
// -> 접근 제어자를 명시하지 않았을 경우 기본적으로 적용되는 제어자.

// 4. private 
// -> 같은 클래스 내에서만 접근 가능
// -> 외부 클래스나 상속받은 클래스에서는 접근 불가능.
// -> 즉, 자식 클래스 일지라도 부모 클래스에서 private이라면 접근불가임.

// 이 접근 제어자들은 클래스, 필드, 메서드 앞에 붙여서 사용하며 각각의 접근 범위를 설정가능.
// 이를 통해 적절한 정보 은닉과 보안을 유지하며, 유지보수성과 확장성을 높일 수 있다.
// ----------------------------------------------------------------------------------------------------------------   
// 4★생성자(Constructor)
// 생성자(Constructor)는 클래스의 인스턴트(객체)가 생성될 때 호출되는 특별한 메서드이다.
// 인스턴스 변수의 초기화 등의 작업을 수행하는 역할을 한다.
// 생성자의 특징은 다음과 같다.
// 1. 생성자의 이름은 클래스의 이름과 같다.
// 2. 생성자는 반환 값이 없다. (void, int, String등의 반환형을 가질 수 없다.)
// 3. 객체 생성 시 반드시 호출 되며, 객체 생성과 함께 인스턴스 변수의 초기화를 수행한다.
// 4. 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 생성한다.
// 5. 생성자를 오버로딩(Overloading)할 수 있다. 즉 매개변수의 개수, 타입, 순서에 따라 
// 다른 생성자를 정의할 수 있다.
// 예시 코드를 살펴보자.
class Student {
    // private 접근 제어자를 사용하여 name과 age 필드를 선언했다. 
    // 이는 클래스 내부에서만 접근 가능하도록 하기위함.
    private String name;
    private int age;

    // 첫번째 생성자 -> 매개변수가 없는 기본 생성자
    // 이 생성자에서는 name과 age를 각각 Unknown과 0으로 초기화 하였다.
    // 즉, 이 생성자로 객체를 생성하면 이름과 나이가 지정되지 않은 기본값으로 초기화 된다.
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    // 두번째 생성자 -> 매개변수가 있는 생성자 public Student(String name, int age)는 매개변수로
    // 이름과 나이를 받아 객체를 생성하는 생성자다. 이 생성자에는 매개변수로 받은 이름과 나이를 
    // 각각 'name'과 'age'필드에 저장한다.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // 객체 생성1 
    // 매개변수가 없는 기본 생성자 호출 
    Student student1 = new Student();
    //System.out.println(student1.getName); // "Unknown" 출력
    //System.out.println(student1.getAge); // 0 출력
    // 객체 생성2
    // 매개변수가 있는 생성자를 호출한다.
    Student student2 = new Student("John", 20);
    //System.out.println(student2.getName); // John출력
    //System.out.println(student2.getAge); // 20 출력.

    // 위 코드에서 Student 클래스는 이름과 나이를 갖는 객체를 생성하는 클래스이다.
    // 기본 생성자와 매개변수가 있는 생성자를 모두 정의 하였다.
    // 객체 생성시 'new'라는 키워드와 함께 생성자를 호출한다. 
    // 여기서 말하는 객체란 어제 배운 인스턴스를 말하는것 같다. 
    // 객체 생성 후 getName() 메서드와 getAge() 메서드를 호출하여 
    // 생성된 객체의 이름과 나이를 출력한다.
    
}
