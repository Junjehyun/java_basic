package fastcam_java.chapter2.ch19;

public class CarFactoryTest {
    public static void main(String[] args) {
        
		// CarFactory의 인스턴스인 factory를 생성하여 가져옴.
		CarFactory factory = CarFactory.getInstance();
		
		// factory의 createCar 메서드를 호출하여 인스턴스 생성
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		// 각 인스턴스의 차량 번호 출력		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
		
    }
}
