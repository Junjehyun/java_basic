package fastcam_java.chapter2.ch08;

public class Baemin {
    // Baemin 클래스의 멤버 변수 7개 선언 
    // 주문접수 번호
    public long orderNum;
    // 주분 핸드폰 번호
    public String orderPhone;
    // 주문 집 주소
    public String orderAddress;
    // 주문 날짜
    public int orderDate;
    // 주문 시간
    public int orderTime;
    // 주문 가격
    public int orderPrice;
    // 메뉴 번호 
    public int menuNum;

    // Baemin클래스의 생성자 메서드 정의 
    // 생성자 메서드는 해당 클래스가 인스턴스화 될 때 호출되며, 인스턴스 변수를 초기화 한다.
    public Baemin(long orderNum, String orderPhone, String orderAddress, int orderDate,
     int orderTime, int orderPrice, int menuNum){
        // this키워드를 사용하여 인스턴스 변수를 가르키도록 한다.
        this.orderNum = orderNum;
        this.orderPhone = orderPhone;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNum = menuNum;
    }

    // Baemin클래스의 orderNum 필드에 접근 할 수 있는 getter 메서드
    // 즉, getOrderNum() 메서드를 호출하면 해당 Baemin 객체의 orderNum 필드값을 반환하게 됨
    // 나머지 필드들도 각각 입력해봄
    public long getOrderNum() {
        return orderNum;
    }
    public String getOrderPhone() {
        return orderPhone;
    }
    public String getOrderAddress() {
        return orderAddress;
    }
    public int getOrderDate() {
        return orderDate;
    }
    public int getOrderTime() {
        return orderTime;
    }
    public int getOrderPrice() {
        return orderPrice;
    }
    public int getMenuNum() {
        return menuNum;
    }

}
