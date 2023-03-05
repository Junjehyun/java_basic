package fastcam_java.chapter2.ch01;

// 객체 지향 프로그램을 할 때는, 객체를 정의하고, 각 객체의 속성을 멤버 변수로 역할을 메서드로 구현하고,
// 각 객체간의 협력을 구현한다.

// 클래스 코딩하기
// 클래스는 대문자로 시작하는게 좋고, 카멜케이스방식을 이용한다.
// java파일 하나에 클래스는 여러개가 있을 수 있지만, public클래스는 하나이고, 
// public클래스와 java파일명은 동일함.

// 멤버 변수 (member variable)란 객체 내부에 선언되어 있는 변수를말한다.
// 클래스 내부에 선언된 변수이며, 객체의 속성을 나타내는 데이터를 저장하기 위해 사용된다.
// 멤버 변수는 클래스 내부에서 어디에서든 접근이 가능하며, 객체가 생성될 때마다 초기화가 되며
// 객체 소멸할때까지 존재한다. 멤버 변수는 일반적으로 클래스의 필드라고도 불린다. 
// 이는 클래스가 갖는 속성이기 때문, 예를들어 자동차 클래스에서 멤버 변수로는 
// 차량의 제조사, 모델명, 색상, 최고속도 가격 등이 있을 수 있다. 이러한 멤버 변수들은
// 자동차 객체가 생성될 때마다 그 값이 초기화 되어 객체의 고유한 속성으로 사용된다.
public class Student {

    // 여기서는 학생이라는 클래스에 
    // 학생번호, 학생이름, 학과코드, 학과이름, 학년등이 멤버 변수이다.
    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;
    
}