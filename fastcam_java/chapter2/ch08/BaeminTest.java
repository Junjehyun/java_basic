package fastcam_java.chapter2.ch08;

public class BaeminTest {
    public static void main(String[] args) {
        Baemin order = new Baemin(202011020003L, "01023450001", "서울시 강남구 역삼동 111-333", 
        20201102, 130258, 35000, 0003);

        System.out.println("주문 접수 번호" + order.getOrderNum());
        System.out.println("주문 핸드폰 번호" + order.getOrderPhone());
        System.out.println("주문 집 주소" + order.getOrderAddress());
        System.out.println("주문 날짜" + order.getOrderDate());
        System.out.println("주문 시간" + order.getOrderTime());
        System.out.println("주문 가격" + order.getOrderPrice());
        System.out.println("메뉴 번호" + order.getMenuNum());

    }
}
