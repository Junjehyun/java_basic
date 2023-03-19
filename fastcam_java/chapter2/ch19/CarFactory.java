package fastcam_java.chapter2.ch19;

public class CarFactory {
    
	// CarFactory 인스턴스를 담는 클래스 변수 Instance를 선언하고,
	// 초기값으로 CarFactory 인스턴스를 할당한다.
	public static CarFactory instance = new CarFactory();
	
	// 차량 번호를 할당하는데 사용되는 변수 carNum을 사용, 초기값으로 10000을 할당한다.
	private int carNum = 10000; 
	
	// 외부에서 CarFactory 인스턴스를 생성하지 못하도록 생성자를 private으로 선언한다.
	private CarFactory() {}
	
	// CarFactory 인스턴스를 반환하는 정적 메서드인 getInstance를 구현
	public static CarFactory getInstance() {
		return instance;
	}
	
	// 차량을 생성하는 메서드인 createCar를 구현한다.
	public Car createCar() {
		// 차량 번호를 증가시키면서 새로운 차량 인스턴스를 생성하고 반환한다.
		carNum++;
		return new Car(carNum);
	}
}
