package fastcam_java.ch12;
// this에 대해 공부한다.
// this란? 객체 자기 자신을 가리키는 것.
// this가 하는일? 
// 1. 인스턴스에서 자신의 메모리를 가리킴.
// 2. 생성자에서 또 다른 생성자를 호출할 때 사용
// 3. 자신의 주소(참조값)을 반환함.

// 클래스에서 생성자가 여러개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출 할 수 있음.
// 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전치 않은 상태이므로
// this() statement 이전에 다른 statement를 쓸 수 없음.


public class Person { // Person class 정의
    // 초기화 되지 않은 name, age 인스턴스 선언. 초기화는 나중에 생성자에서 한다. 일단 선언만.
    String name;
    int age;

    // 생성자 1 
    // 여기서는 매개 변수를 가지지 않으며 this()를 사용하여 두 번째 생성자를 호출한다.
    public Person() {
    
        this("no name", 1);
    }

    // 생성자 2
    // 여기서는 매개 변수를 가지며, 인스턴스 변수인 name과 age를 초기화 한다.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + ", " + age);
    }

    public Person getPerson(){
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
