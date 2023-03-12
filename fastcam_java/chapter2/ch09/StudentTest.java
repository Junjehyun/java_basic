package fastcam_java.chapter2.ch09;

public class StudentTest {
    // 학생 두 명의 국어, 성적을 입력하고 출력해보자
    public static void main(String[] args) {
        // student 클래스의 생성자를 호출해서 studentLee 인스턴스 생성한다.
        // 생성자 파라미터로 학생 id와 이름을 전달
        Student studentLee = new Student(100, "Lee");
        // setKoreaSubject 메서드를 호출하여 국어 과목의 이름과 점수를 입력
        studentLee.setKoreaSubject("국어", 100);
        // setMathSubject 메서드를 호출하여 수학 과목의 이름과 점수를 입력
        studentLee.setMathSubject("수학", 95);
        // showInfo를 통해 출력한다.
        studentLee.showScoreInfo();

        // 같은 방식으로 학생을 한명 더 생성해보자. 이번엔 kim이다.
        Student studentKim = new Student(99, "Kim");
        studentKim.setKoreaSubject("국어", 60);
        studentKim.setMathSubject("수학", 30);
        studentKim.showScoreInfo();
    }
}
