package fastcam_java.chapter2.ch15;

public class TakeTaxiTest {
    public static void main(String[] args) {

        Guest guestE = new Guest("Edward", 20000);
        
        Taxi taxi1 = new Taxi("잘나간다 운수택시");

        guestE.takeTaxi(taxi1);

        guestE.showInfo();
        taxi1.showTaxiInfo();
    }
}
