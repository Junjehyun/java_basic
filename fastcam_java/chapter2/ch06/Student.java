package fastcam_java.chapter2.ch06;

// 클래스
public class Student {
    // 클래스의 멤버 변수 3개
    // 학번을 지정하는 int 타입 변수
    public int studentNumber;
    // 이름을 저정하는 String 타입의 멤버 변수
    public String studentName;
    // 학년을 저장하는 int 타입의 멤버 변수
    public int grade;

    // 아무런 매개변수가 없는 생성자로, 기본 생성자이다.
    public Student() {}

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    // 멤버 변수값을 활용하여 학생 정보를 출력하는 메서드
    public String showStudentInfo(){
        return studentName + "학생의 학번은 " + studentNumber + "이고, " +
         grade + "학년 입니다. ";
    }
}
