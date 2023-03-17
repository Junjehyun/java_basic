package fastcam_java.chapter2.ch15;

public class TakeTaxiTest {
    
    public static void main(String[] args) {

        // Guest 클래스의 인스턴스를 생성하고, 이름과 돈을 매개변수로 전달한다.
        Guest guestE = new Guest("Edward", 20000);
        
        // Taxi 클래스의 인스턴스를 생성하고, 회사 이름을 매개변수로 전달한다.
        Taxi taxi1 = new Taxi("잘나간다 운수택시");

        // Guest 클래스의 takeTaxi 메소드를 호출하고, 택시 인스턴스를 매개변수로 전달한다.
        guestE.takeTaxi(taxi1);

        // Guest 클래스의 showInfo 메소드를 호출하여, 게스트의 정보를 출력한다.
        guestE.showInfo();
        
        // Taxi 클래스의 showTaxiInfo 메소드를 호출하여, 택시의 정보를 출력한다.
        taxi1.showTaxiInfo();
    }
}
