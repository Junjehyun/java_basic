package fastcam_java.chapter2.ch12;

public class Person {
    // 객체 자신을 가리키는 this
    // this가 하는 일
    // 인스턴스 자신의 메모리를 가리킴
    // 생성자에서 또 다른 생성자를 호출할 때 사용
    // 자신의 주소(참조값을) 반환함

    // 클래스에서 생성자가 여러개인 경우 this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음.
    // 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전치 않은 상태이므로,
    // this() statement 이전에 다른 statement를 쓸 수 없음.

    String name;
    int age;

    // 생성자1
    // Person() 생성자는 인자가 없으며, 
    // "no name"과 1로 초기화된 name과 age를 가진 Person 객체를 생성
    // 이 때, this()를 사용하여 생성자에서 다른 생성자를 호출
    // 이것은 생성자 내에서 다른 생성자를 호출하는 데 사용되며, 생성자 오버로딩을 간단하게 구현하는 데 유용
    public Person() {
        this("no name", 1);
    }
    // 생성자2
    // name과 age를 인자로 받아와 해당 값을 인스턴스 변수에 할당
    // 즉 Person 클래스는 이름과 나이를 가진 객체를 만들 수 있으며, 
    // 인자를 제공하지 않으면 no name과, 1로 초기화된 객체가 만들어짐 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Person 클래스의 name과 age 인스턴스 변수를 출력하는 역할
    // 즉, showPerson() 메서드를 호출하면 해당 Person 객체의 name과 age가 출력
    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    //getPerson() 메서드는 자기 자신을 반환하는 메서드이다. 이 메서드는 Perosn 클래스의
    // 객체를 생성하고, 이 객체를 참조하는 참조 변수를 만든 뒤, getPerson()메서드를 호출하여
    // 자기 자신을 반환하게 된다. 
    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        
        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
