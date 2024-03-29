package fastcam_java.chapter2.ch14;

public class TakeTransTest {

    public static void main(String[] args) {
        // student 객체 생성
    Student studentJ = new Student("James", 5000);
    Student studentT = new Student("Tomas", 10000);

    // Bus 객체 생성
    Bus bus100 = new Bus(100);
    Bus bus500 = new Bus(500);


    studentJ.takeBus(bus100);

    Subway greenSubway = new Subway(2);
    studentT.takeSubway(greenSubway);

    studentJ.showInfo();
    studentT.showInfo();

    bus100.showBusInfo();
    greenSubway.showBusInfo();

    bus500.showBusInfo();

    }
    

}
