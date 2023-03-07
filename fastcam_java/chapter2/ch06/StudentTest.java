package fastcam_java.chapter2.ch06;

public class StudentTest {

    public static void main(String[] args) {
        
        // student클래스를 기반으로 한 학생 Lee의 인스턴스를 생성
        Student studentLee = new Student();
        studentLee.grade = 1;

        // studentLee를 출력해봄
        System.out.println(studentLee.showStudentInfo());
        // 클래스의 멤버 변수에 초기값을 넣지 않았기 때문에
        // 문자열에는 null, 숫자형에는 0이 출력된다.

        Student studentKim = new Student(123456, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
    
}
