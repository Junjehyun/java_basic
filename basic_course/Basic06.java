// 06.상속
// 1★상속 개념과 구현
// 2★부모 클래스와 지식 클래스
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



}
