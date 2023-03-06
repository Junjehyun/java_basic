package fastcam_java.chapter2.ch04;
// 메서드 (method)
// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
// 멤버 함수 라고도 함.
// 메서드를 구현함으로써 객체의 기능이 구현 됨
// 메서드의 이름은 그 객체를 사용하는 객체(클라이언트)에 맞게 짓는것이 좋음.
//ex) getStundentName()

// 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다.
// Student 클래스를 정의 하는것으로, 클래스 내에 멤버 변수 3개가 선언되어있다.
public class Student {
    // 클래스의 속성(멤버 변수) 3개를 선언. (학번 / 학생이름 /주소)
    public int studentID;
    public String studentName;
    public String address;

    // 학생의 정보를 보여주는 메서드
    // void는 반환값이 없는 예약어이다. 'void'를 반환 타입으로 선언한 메소드는 값을 반환하지 않고,
    // 그저 작업을 수행하고 종료한다.

    // 학생 정보를 출력하는 멤버 메서드
    public void showStudentInfo() {
        System.out.println( studentID + "학번 학생의 이름은 " 
        + studentName + "이고, 주소는 " + address + "입니다.");
    }

    // 학생 이름을 반환하는 멤버 메서드
    public String getStudentName() {
        return studentName;
    }
    // 학생 이름을 설정하는 멤버 메서드
    public void setStudentName(String name) {
        studentName = name;
    }

}
