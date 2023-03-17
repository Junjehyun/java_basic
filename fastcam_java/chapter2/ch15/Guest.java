package fastcam_java.chapter2.ch15;
// Edward님의 남은 돈은 10000원 입니다.
// 잘나간다 운수택시 수입은 10000원 입니다.
// 가 출력이 되야함.

// Guest 클래스 선언
public class Guest {

    // 손님 이름과 돈 변수 선언
    String guestName;
    int money;

    // Guest 생성자 메소드
    public Guest(String guestName, int money) {
        // 손님 이름과 돈 초기화
        this.guestName = guestName;
        this.money = money;
    }

    // 택시를 타는 메소드
    public void takeTaxi(Taxi taxi) {
        // 택시 객체의 take 메소드 호출하여 10000원 지불
        taxi.take(10000);
        // 손님의 돈에서 10000원 차감
        this.money -= 10000;
    }

    // 손님 정보 출력 메소드
    public void showInfo() {
        // 손님 이름과 남은 돈 출력
        System.out.println(guestName + "님의 남은 돈은 " + money + " 입니다.");
    }

}
