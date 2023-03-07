// 05-2.클래스와 객체
// 5★this 키워드와 객체 참조 변수
// 6★static 멤버 (필드, 메서드)
package basic_course;

public class basic05_2 {
// 5★this 키워드와 객체 참조 변수
// this키워드 
// this키워드는 객체의 인스턴스 변수와 메소드를 참조하기 위해 사용된다. 
// 객체가 생성되면 인스턴스 변수와 메소드는 객체의 메모리 공간에 저장된다.
// 따라서 객체 안에서 인스턴스 변수와 메소드에 접근할 때 this키워드를 사용한다.
// 아래와같이 Student클래스에서 생성자와 메소드에서 this키워드를 사용한 예시를 살펴보자.
public class Student {
    // Student클래스에 속하는 인스턴스 변수 name, age 선언. 
    // private 접근 제어자를 사용하여 클래스 외부에서 직접 접근하지 못하도록한다.
    private String name;
    private int age;

    // Student 클래스의 생성자를 정의한다. 생성자는 클래스를 초기화하는 역할을 말하며,
    // 이 경우에는 name과 age라는 매개변수를 받는다. this 키워드는 인스턴스 변수를 가리키며,
    // this.name은 클래스 인스턴스 변수 name을 this.age는 클래스의 인스턴스 변수 age를 의미함.
    // 따라서 생성자에게 this.name = name은 매개변수로 받은 name값을 인스턴수 변수 name에 대입하라는 의미,
    // this.age = age는 매개변수로 받은 age값을 인스턴스 변수 age에 대입하라는 의미다.
    public Student(String name, int age) {
        // 인스턴스 변수인 name에 매개변수로 전달된 name값 할당
        this.name = name;
        // 인스턴스 변수인 age에 매개변수로 전달된 age값 할당
        this.age = age;
    }
    public String getName() {
        // 인스턴트 변수인 name을 반환
        return this.name;
    }
    public int getAge() {
        // 인스턴트 변수인 age를 반환
        return this.age;
    }
    // 그리고 객체 참조 변수는 객체가 생성된 메모리의 주소를 저장하는 변수를 말한다.
    // 이 변수는 객체의 필드나 메소드에 접근하기 위해 사용된다. 에를들어 살펴보자
    Student S = new Student("John", 25);
    // 위 코드에서 s는 객체 참조 변수이며, 생성된 Student 객체의 주소를 저장한다.
}

// ----------------------------------------------------------------------------------------------------------------   
// 6★static 멤버 {필드(혹은 변수), 메서드}
// Static 멤버란, 객체의 인스턴스와 관계 없이 클래스 자체에 속하는 멤버를 말한다.
// 따라서 static 멤버는 객체 생성 없이 바로 사용할 수 있다.
// static 멤버에는 변수와 메서드가 있다. 
// static 변수 : 클래스 변수 혹은 필드라고도 부르며, 클래스의 모든 인스턴스에서 공유하는 변수다.
// static 변수는 클래스가 처음 로딩될 때 메모리에 할당되며, 프로그램이 종료될 때까지 유지된다.

// static 메서드 : 클래스 메서드라고도 부르며, 객체를 생성하지 않고도 바로 호출할 수 있는 메서드다.
// static 메서드는 인스턴스 변수를 사용할 수 없다. 대신 static 변수와 같이 클래스가 처음 로딩될 때 
// 메모리에 할당 되어 프로그램이 종료될 때까지 유지된다.

// static 멤버는 클래스 변수와 클래스 메서드를 선언할 때 "static" 키워드를 사용하여 표시,
// 예를들어 다음은 static 변수와 static 메서드가 선언된 예시다.
 class MyClass {
    static int count; // static 변수
    int number; // 인스턴스 변수

    static void incrementCount() { // static 메서드 
        count++;
    }

    void setNumber(int num) {
        number = num;
    }
 }
 // 위의 예시에서 count 변수와 incrementCount() 메서드는 static으로 선언되어 있으며,
 // number 변수와 setNumber() 메서드는 인스턴스 변수와 인스턴스 메서드이다.
}