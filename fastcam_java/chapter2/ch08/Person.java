package fastcam_java.chapter2.ch08;

public class Person{
    // 복습 테스트 
    // 출력값: 키가 180cm이고, 몸무게가 78kg인 남자가 있습니다.
    // 이름은 Tomas이고, 나이는 37세 입니다.

    // Person 클래스의 멤버변수 선언한다. 총4개
    // 몸무게
    public int weight;
    // 키
    public int height;
    // 이름
    public String personName;
    // 나이
    public int age;

    // Person Class의 생성자 메서드. 클래스의 인스턴스 생성시 전달되는 인자를 받아서
    // Class의 멤버 변수인 Weight, Height, personName, age에 각각 할당해준다.
   public Person(int height, int weight, String personName, int age) {
    // this는 인스턴스 자신을 의미하며, 클래스의 내부에서 인스턴스 자신을 가리키는 참조 변수
    // this를 사용함으로써 생성자 메서드 내에서 클래스의 멤버 변수에 접근 가능.
    // 즉, this.weight는 클래스의 멤버 변수인 weight를 나타내며, 
    // 뒤의 weight는 생성자 메서드의 인자 중 하나를 나타내는 것.
    this.weight = weight;
    this.height = height;
    this.personName = personName;
    this.age = age;
   }

   // ShowInfo()메서드는 해당 클래스의 정보를 출력하는 기능을 수행한다.
   // 메서드 내부에서는 클래스의 필드 값(몸무게, 키 등)을 사용해, 클래스 정보를 문자열 형태로 반환

   public String PersonShowInfo() {
    return "키가 " + height + "cm 이고 " + "몸무게가 " + weight + "kg인 남성이 있습니다. " + "이름은 "
     + personName + "이고 " + "나이는 " + age + "세 입니다.";
   }
}