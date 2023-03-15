// 7.인터페이스와 추상 클래스
// 1★인터페이스와 추상 클래스 개념과 구현
// 2★인터페이스 상속
// 3★default 메서드와 static 메서드

package basic_course;

public class Basic07 {
// 1★인터페이스와 추상 클래스 개념과 구현
// 1-1 추상 클래스 (Abstract Class)

// 추상 클래스는 실체 클래스 (Concrete Class)를 만들기 위한 일종의 설계도 역할을 한다.
// 추상 클래스는 자신을 상속하는 하위 클래스에서 반드시 구현해야 하는 메소드를 선언할 수 있다.
// 코딩 예시

// 추상 클래스 Animal 선언
// 그리고 밑에 추상 메서드 makeSound() 선언

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    
    public int getAge() {
        return age;
    }

    // 추상 메서드 선언
    // 추상 메서드는 메서드의 구현을 하위 클래스에서 구현하도록 강제한다.
    // 따라서 Animal 클래스를 상속하는 하위 클래스는 makeSound()를 구현해야한다.
    public abstract void makeSound();

    // 부모 클래스가 추상 클래스이면 자식 클래스도 추상 클래스로 맞춰줘야 한다.
    public abstract class Tiger extends Animal {
        public Tiger(String name, int age) {
            super(name,age);
            }

    // Dog 클래스는 Animal클래스의 자식 클래스이다. 그리고 makeSound() 메서드를 구현했다.
    // 이렇게 하위 클래스에서 추상 메서드를 구현 함으로써 실제 객체를 생성할 수 있다.    
    public void makeSound() {
        System.out.println("멍멍!");
        }
    }
    
}
//------------------------------------------------------------------------------------------
// 1-2 인터페이스 (Interface)
// 인터페이스는 클래스와는 다르게, 멤버 변수를 가질 수 없고, 모든 메서드는 추상 메서드이다.
// 그에 따라 모든 메서드는 하위 클래스에서 반드시 구현 되어야한다. 인터페이스는 특정한 기능에 표준화된
// 규약을 정의하는 용도로 사용된다. 일종의 약속인건가 ? 

// Drivable 인터페이스는 accelerate()와 brake()라는 추상 메서드를 선언하고 있다.
// 이 인터페이스를 구현하는 클래스는 이 두(엑셀,브레이크) 메서드를 반드시 구현해야만 한다.
public interface Drivable {
    void accelerate(int speed);
    void brake(int speed);

    // implements는 인터페이스를 구현하는 클래스를 정의할때 사용됟ㅁ. 인터페이스는 추상적인 개념으로
    // 클래스가 반드시 구현해야하는 메서드들의 시그니처를 정의한다. 
    // implements 키워드는 클래스가 해당 인터페이스를 구현하고 있음을 나타내는 것.

    public class Car implements Drivable {
        private String name;

        public Car(String name) {
            this.name = name;
        }
        // 'Car' 클래스는 'Drivable' 인터페이스를 구현하고 있다. 따라서 
        // accelerate()와 break() 메서드를 반드시 구현해야한다. 

        // 요렇게 구현했다.
        public void accelerate(int speed) {
            System.out.println(name + " is accelerating at " + speed + " mph");
        }

        public void brake(int speed) {
            System.out.println(name + " is braking at " + speed + " mph");
        }
    }
}
//------------------------------------------------------------------------------------------------
// 2★인터페이스 상속
// 인터페이스 상속(interface Inheritance)은 인터페이스가 다른 인터페이스를 상속하는걸 말한다.
// 자바에서 인터페이스 상속은 extends 키워드를 사용하여 구현된다. 인터페이스 A가 인터페이스 B를 상속하면
// A는 B의 메서드를 상속하고, A에서 새로운 메서드를 정의할 수 있다. 코드 예시로 보자

    public interface B {
        void methodB();
    }
    public interface A extends B {
        void methodA();
    }
// 인터페이스 A는 인터페이스 B를 상속하고 있으므로, A는 B의 메서드인 methodB()를 상속받게 됨.
// 또한 A는 자신만의 메서드인 methodA()를 정의할 수 있다.
// 이렇게 인터페이스 상속을 사용하면 코드의 재사용성을 높일 수 있다. 인터페이스 상속을 통해 다양한
// 인터페이스를 조합하여 필요한 기능을 제공하는 새로운 인터페이스를 만들 수 있다.
//------------------------------------------------------------------------------------------------
// 3★default 메서드와 static 메서드
// 자바8부터 인터페이스에 default메서드와 static메서드를 선언할 수 있게 되었다. 
// default 메서드는 인터페이스에서 구현된 메서드로, 구현 클래스에서 이를 오버라이드 할 수 있다.
// 인터페이스를 수정하지 않고 새로운 기능을 추가할 수 있어서 유용한것.

    public interface MyInterface {
        // 추상 메서드 선언하고
        void abstractMethod();

        // defaultMethod()가 구현된 메서드로 선언되어 있다.
        // 구현 클래스에서는 abstractMethod()를 반드시 구현해야 하지만, 
        // defaultMethod()는 구현하지 않아도 된다.
        default void defaultMethod() {
            System.out.println("this is a default method.");
        }
    }

    // 또한 static 메서드는 인터페이스에서 구현된 메서드로, 인터페이스 이름으로 직접 호출할 수 있다.
    // 이는 인터페이스와 관련된 유틸리티 메서드를 제공할 때 유용하다.
    // 예를들어, 다음과 같은 인터페이스가 있다고 해보자

    public interface YourInterface {
        void abstractMethod();

        default void defaultMethod() {
            System.out.println("This is a default method.");
        }

        static void staticMethod() {
            System.out.println("This is a static method.");
            YourInterface.staticMethod();
        }
        // 위 인터페이스에서는 abstractMethod()와 defaultMethod()가 이전과 동일하게 선언됨.
        // 추가로 staticMethod()가 static 메서드로 선언 되어있음. 
        // 인터페이스에서는 인터페이스 이름으로 'staticMethod()'를 직접 호출할 수 있다.
        
    }
   

}
