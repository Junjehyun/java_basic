// 06.상속
// 1★상속 개념과 구현
// 2★부모 클래스와 자식 클래스
// 3★메서드 오버라이딩
// 4★super 키워드

package basic_course;

public class Basic06 {
// 1★상속 개념과 구현

// 상속(Inheriance)은 객체 지향 프로그래밍에서 기존의 클래스를 재사용하여 새로운 클래스를
// 작성하는 것이다. 기존 클래스에서 정의된 필드와 메서드를 상속받아 새로운 클래스에서 
// 재사용할 수 있도록 한다. 기존의 클래스를 재사용 한다는 개념이 가장 가깝겠다.

// 기존 클래스를 부모 클래스 또는 상위 클래스라고 하며, 상속받은 새로운 클래스를 자식 클래스
// 또는 하위 클래스라고 한다. 자식 클래스는 부모 클래스가 가지고 있는 모든 필드와 메서드를 
// 상속 받아서 사용할 수 있으며, 자신만의 필드와 메서드를 추가할 수도 있습니다.

// 자식 클래스는 extends 키워드를 사용하여 부모 클래스를 지정한다. 자식 클래스는 부모 클래스가 가진
// 모든 필드와 메서드를 상속받아 사용할 수 있다. 필요한 경우에는 오버라이딩 (Overriding)을 통해 
// 부모 클래스의 메서드를 재정의할 수도 있다. 코드를 통해 살펴보자

// 예를들어 다음과 같은 부모 클래스인 Animal이 있다고 가정해보자.
    public class Animal {
        // 이름, 나이 멤버변수 선언
        private String name;
        private int age;


        // 생성자 메서드 정의
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Animal 클래스의 두 개의 메서드인 eat()과 sleep()를 정의
        // void는 메서드에서 반혼값이 없음을 나타내는 자바의 예약어이다. 즉, 메서드가 
        // 호출되었을 때 어떤 값을 반환하지 않고 실행만 한다는 것을 의미한다.

        // void는 단순히 어떤 동작을 수행하고 결과를 반환하지 않아도 되는 경우에 사용.
        // 예를들어, 화면에 출력하는 기능이나 파일에 저장하는 기능은 호출자에게 반환값을 
        // 제공하지 않고, 단지 화면에 텍스트를 표시하거나 파일에 데이터를 기록하는것에 불과하다.
        // 따라서 이런 경우는 메서드의 반환 타입은 void가 된다.
        public void eat() {
            // 여기서도 name + is eating이라는 문자열만 출력하고 끝이기 때문에 반환값이 필요 X
            System.out.println(name + "is eating ");
        }

        public void sleep() {
            System.out.println(name + "is sleeping ");
        }

        public void introduce() {
            System.out.println("my name is " + name + "and " + age + " years old!");
        }
    }

    // Animal 클래스를 상속받는 자식 클래스인 Dog클래스를 정의하는 코드이다.
    // 자식 클래스는 extends 키워드를 사용하여 부모 클래스를 지정한다.
    // 자식 클래스는 부모 클래스가 가진 모든 필드와 메서드를 상속받아 사용할 수 있으며, 필요한 경우에는
    // 오버라이딩(Overriding)을 통해 부모 클래스의 메서드를 재정의 할 수도 있다.

    // 자식 클래스인 Dog를 만들었다.
    // Dog란 클래스를 생성하고 키워드 extends를 이용해 Animal을 상속받음.
    public class Dog extends Animal {
        public Dog(String name, int age) {
            // super 키워드를 이용해 부모클래스의 name, age 멤버 변수를 참조하고 있다.
            // super.name은 super.age는 부모 클래스의 멤버 변수를 의미하며, 
            // 부모 클래스의 멤버 변수에 접근할 때 사용한다.
            super(name, age);
        }
        // bark메서드는 추가적으로 작성했고, 나머지 eat이나 sleep은 부모꺼를 가져온거다.
        public void bark() {
            System.out.println("Woof!");
        }
        @Override
        public void sleep() {
            // 이렇게 super.name 키워드를 사용하면 부모 클래스에서 정의한 멤버 변수를 참조할 수 있게된다.
            System.out.println(super.name + " is sleeping on the floor.");
        }
    }
// ------------------------------------------------------------------------------------------
// 2★부모 클래스와 지식 클래스
// 위에서 부모 클래스와 자식 클래스를 공부했다. 
// 다시 한번 간단하게 개념만 잡고 넘어가자 
// 부모 클래스와 자식 클래스는 상속 개념과 밀접하게 관련된 클래스다. 
// 부모 클래스는 자식 클래스에게 상속을 제공하는 클래스이며, 자식 클래스는 부모 클래스에서 정의된 멤버 변수
// 와 메서드를 상속받아 사용할 수 있다. 예를들어 부모 클래스가 포유류라면 자식 클래스는 고래, 원숭이 등
// 여러 포유류 종들을 나타낼 수 있다. 
// 자식 클래스에서 부모 클래스로부터 상속받은 멤버 변수와 메서드에 접근하려면 super키워드를 사용한다.
// super키워드는 부모 클래스를 가리키는 참조 변수다. 이를 이용하면 부모 클래스에서 정의된 멤버 변수와
// 메서드에 접근 가능하다.

// 상속을 이용하면 중복 코드를 제거하고 코드의 재사용성을 높일 수 있다. 또한 객체지향 프로그래밍의 
// 핵심 개념중 하나인 다형성을 구현하는 데에도 중요한 역할을 한다.
// ------------------------------------------------------------------------------------------
// 3★메서드 오버라이딩
// 이것 역시 위에서 했지만 다시 한번 간단하게 복습하고 가자.
// 메서드 오버라이딩(Overriding)은 상속받은 부모 클래스의 메서드를 자식 클래스에 재정의 하는것을 말한다.
// 이를 통해 자식 클래스는 부모 클래스로부터 상속받은 메서드를 자신에게 맞게 변경할 수 있다.

// 메서드 오버라이딩을 사용하면, 부모 클래스와 자식 클래스 간에 같은 이름의 메서드가 존재하게 될 것이다.
// 그리고 이러한 경우 자바는 다형성을 활용하여, 객체의 타입에 따라 해당 객체에서 호출할 메서드가 결정됨.

// 메서드 오버라이딩을 구현하기 위해서는, 메서드의 이름, 매개변수, 반환형 모두가 일치해야한다.
// 그리고 메서드의 접근 제어자는 부모 클래스의 메서드와 같거나 더 넓은 범위로 설정해야한다.

// 예시 코드를 살펴보자. 
        // 동물이라는 부모 클래스를 만들었다.
        class DongMul {

        // 동물 클래스의 makeSound()메서드!
        // 이 메서드는 해당하는 동물이 단순히 동물이 소리를 냅니다! 라는 메세지를 출력한다.  
        // 이 메서드는 자식 클래스 Rabbit에서도 오버라이딩을 해서 사용이 가능하다.
        public void makeSound(){

            System.out.println("The animal makes a sound!");
        }
    }   

    class Rabbit extends DongMul {

        @Override
        public void makeSound() {
            System.out.println("Hiiiiiiiiiiiiiiiiii");
        }
    }

    class Lion extends DongMul {

        @Override
        public void makeSound() {
            System.out.println("uwaaaaaaaaaaaaaaaa");
        }
    }


// ------------------------------------------------------------------------------------------
// 4★super 키워드
// super 키워드는 자식 클래스에서 부모 클래스로부터 상속받은 멤버(필드, 메서드)를 참조하는데 사용되는
// 특수한 참조 변수이다.
// 자식 클래스에서 부모 클래스의 멤버를 참조할 때 'super' 키워드를 사용합니다. 이때 'super'키워드를
// 사용하면 부모 클래스의 멤버와 자식 클래스의 멤버를 구분할 수 있다.

// 'super'키워드는 다음과 같은 상황에서 사용된다.

// 1. 부모 클래스의 생성자 호출 : 자식 클래스의 생성자에서 super()키워드를 사용하여 부모 클래스의 
// 생성자를 호출할 수 있다. 이때 super()키워드는 반드시 자식 클래스의 생성자 첫 줄에서 호출 되어야한다.

// 2. 부모 클래스의 멤버 참조 : 자식 클래스에서 부모 클래스의 멤버를 참조할 때 'super'를 사용하여
// 부모 클래스의 멤버를 참조할 수 있다. 이때 super를 사용하면 부모 클래스의 멤버와 자식 클래스의 멤버를 
// 구분할 수 있다. 

// 코딩 예시를 살펴본다.
// 예를들어 다음과 같은 'CellPhone' 부모 클래스와 'iPhone' 자식 클래스가 있다고 가정해보자.

    class CellPhone {
        protected String name;
        protected int price;

        public CellPhone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void famous_rank() {
            System.out.println("the best cellphone is iPhone!");
        }

        public void rival() {
            System.out.println("rival is Galaxy");
        }
    }

    class iPhone extends CellPhone {


        public iPhone(String name, int price) {
            // 여기 super (name, price)는 'iPhone'클래스의 생성자에서 'CellPhone'클래스의
            // 생성자를 호출한다. 
            super(name, price);
            
        }

        iPhone myPhone = new iPhone("my iPhone", 1000000);
        

        public void accessory() {
            System.out.println("The best Accessory is Air-pods");
        }

        // super.famous_rank()와 super.rival()은 iPhone클래스에서 오버라이딩한
        // famous_rank()와 rival() 메서드에서 부모 클래스의 famous_rank()와 
        // rival() 메서드를 호출한다.

        public void famous_rank() {
            super.famous_rank();
            System.out.println("iPhone is the best product of the world");
        }

        public void rival() {
            super.rival();
            System.out.println("the rival is samsung and google fixel");
        }


        // 이와같이 super키워드는 자식 클래스에서 부모 클래스의 멤버를 참조할 때 사용되며,
        // 부모 클래스의 생성자를 호출할 때도 사용된다.
    }
}