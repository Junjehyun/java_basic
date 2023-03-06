package fastcam_java.chapter2.ch04;

public class StudentTest {
    // 하단 studentLee, studentKim 등은 참조 변수라고 부른다.
    public static void main(String[] args) {

        // student클래스를 기반으로 학생 Lee의 인스턴스를 생성
        Student studentLee = new Student();
        // Lee라는 인스턴스의 멤버변수 초기화 과정.
        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울시 강남구";
        // showStudentInfo() 메서드를 호출해 Lee인스턴스의 정보를 출력
        studentLee.showStudentInfo();


        // student클래스를 기반으로 학생 Kim의 인스턴스를 생성.
        Student studentKim = new Student();

        // Kim이라는 인스턴트의 멤버변수 초기화 과정.
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";
        // showStudentInfo() 메서드를 호출해 Kim인스턴스의 정보를 출력
        studentKim.showStudentInfo();



        
    }
}
