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

        // 힙 메모리 
		// 생성된 인스턴스는 동적 메모리 (heap memory)에 할당됨.
		// C나 C++에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야 함(free()나 delete이용)
		// java에서 Gabage Colletor가 주기으로 사용하지 않으면 메모리를 수거
		// 하나의 클래스로부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨.
		// 힙 메모리 주소값 출력 -> 물리적인 주소가 아니라 jvm이 주는 가상 어드레스
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		// 용어 정리
		// 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
		// 클래스 : 객체를 프로그래밍 하기 위해, 코드로 정의 해놓은 상태 
		// 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
		// 멤버 변수 : 클래스의 속성, 특성
		// 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
		// 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
		// 참조 값 : 생성된 인스턴스의 메모리 주소 값

        
    }
}
