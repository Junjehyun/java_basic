package fastcam_java.chapter2.ch14;
// 대중교통을 이용하고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
public class Student {
    // 인스턴스 변수 선언
    String studentName;
    int money;

    // 생성자
    // studentName과 money 두 개의 매개변수를 받아서 해당 값을 인스턴스 변수에 할당하게 됨.
    // 즉 student 객체를 생성할 때는 반드시 'studentName'과 'money'를 지정해야 하며,
    // ex) Student student1 = new Student("홍길동", 1000);
    // 즉, 홍길동이 studentName에 할당되고, 1000이 money에 할당된다.
    // 이렇게 생성된 student1 객체는 student클래스의 인스턴스 변수에 해당 값들이 저장된 상태가 됨.
    // 이 값들이 객체 내부의 인스턴스 변수에 저장된다.

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // Bus 클래스의 인스턴트를 객체를 인자로 받아와서 해당 버스의 take() 메서드를 호출한다.
    // 이때 인자로 1000을 전달하여 버스 탑승료를 지불한다.
    // 그리고 학생의 돈에서 1000을 차감한다. 즉 이 메서드를 호출하면 학생은 해당 버스에 탑승하고
    // 탑승료를 지불하게 되는 구조.

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    // takeSubway 메서드도 마찬가지로 subway 객체를 인자로 받아와서 해당 지하철의
	// take 메서드를 호출 한다. 이 때 인자로 1200을 전달하여 탑승료를 지불, 그리고
	// 학생의 돈에서 1200을 차감.

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    // 학생의 이름과 남은 돈을 출력한다.
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다. ");
    }
}
