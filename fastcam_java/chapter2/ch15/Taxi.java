package fastcam_java.chapter2.ch15;

    // Taxi 클래스 선언
public class Taxi {
    // 택시 이름 변수 선언
    String taxiName;
    // 수입 변수 선언
    int money;

    // 택시 이름을 매개변수로 받는 생성자
    public Taxi(String taxiName) {
    // 택시 이름 초기화
        this.taxiName = taxiName;
    }

    // 탑승 요금을 매개변수로 받아 수입을 누적하는 메소드
    public void take(int money) {
    // 수입 누적
        this.money += money;
    }

    // 택시 정보를 출력하는 메소드
    public void showTaxiInfo() {
    // 택시 이름과 수입 출력
        System.out.println(taxiName + " 수입은" + money + "원 입니다. ");
    }
}
