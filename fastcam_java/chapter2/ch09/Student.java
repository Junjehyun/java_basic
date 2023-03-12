package fastcam_java.chapter2.ch09;

public class Student {
    // 참조 자료형

    // 변수의 자료형
    // 기본 자료형 -> int, long, float, double등
    // 참조 자료형 -> String, Date, Student(object형의 객체 데이터 타입)등

    // 클래스형으로 변수를 선언한다. 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만,
    // 참조 자료형은 클래스에 따라 다름. (String 클래스는 예외적으로 생성하지 않고 사용 가능)

    // 학생이 수강한 과목들에 대한 성적을 산출하기 위한 경우, 학생 클래스 속성에 과목이 모두
    // 있으면 불합리하다. 학생(Student)과 과목(Subject)에 대한 클래스를 분리해서 사용하고
    // Subject 클래스를 활용하여 수강한 과목들의 변수를 타입으로 선언한다.
    // 선언된 Subject 변수는 생성된 인스턴트가 아니므로, Student 생성자에서 생성해서 사용한다.

    int studentId; // 학생의 학번 정보를 저장하는 멤버 변수
    String studentName; // 학생의 이름 정보를 저장하는 멤버 변수

    // 같은 패키지에 별도로 Subject라는 클래스를 일단 만들어둠
    // Subject 클래스는 학생이 수강한 과목에 대한 정보를 저장하기 위한 클래스로
    // 과목명과 점수를 저장 할 수 있다. 이 두가지 정보를 저장하기 위한 멤버 변수가 필요하며
    // subjectName과 score라는 변수명으로 선언한다.

    Subject korea; // 국어 성적을 저장하는 Subject 타입의 멤버 변수
    Subject math; // 수학 성적을 저장하는 Subject 타입의 멤버 변수
    
    // Student의 생성자 메서드로, 학생의 학번과 이름 정보를 인자로 받아 초기화 하는 역할을 함
    // 생성자 메서드는 해당 클래스가 인스턴스화 될 때 호출되며, 인스턴스 변수를 초기화 한다.
    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

    // 생성자 메서드에서 korea와 math 객체를 초기화 하는 이유는, 학생 객체가 생성 될 때마다
    // 학생의 과목 정보를 생성하여 관리할 수 있도록 하기 위함이다.
    // 여기서 생성된 인스턴스 변수는 setKoreaSubject()와 setMathSubject()에 나중에 과목명과
    // 점수를 저장할 수 있다. 따라서 student 객체를 생성할 때마다 korea와 math 인스턴수 변수가
    // 생성되어 초기화 하게 되고, 이후에 setKoreaSubject(), setMathSubject()를 통해 
    // 메서드를 초기화 할 수 있다. 

    korea = new Subject();
    math = new Subject();
    }

    // 국어 과목의 성적 이름과 정보를 인자로 받아 해당 정보를 korea 변수에 저장하는 메서드.
    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }
     // 수학 과목의 성적 이름과 정보를 인자로 받아 해당 정보를 math 변수에 저장하는 메서드.
     public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
     }

     // 총점을 출력하는 메서드.
     // total이라는 변수를 국어+수학 점수로 설정하고 출력해준다
     public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println( studentName + "학생의 총점은 " + total + "점 입니다. ");

     }
}
