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


}
