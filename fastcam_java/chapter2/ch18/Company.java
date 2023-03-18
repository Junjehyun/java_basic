package fastcam_java.chapter2.ch18;
// 싱글톤 패턴 디자인 구현
// Company 클래스의 인스턴스를 딱 하나만 생성한다.

public class Company {

private static Company instance = new Company();

private Company() {

}

public static Company getInstance() {
    if ( instance == null)
         instance = new Company();
         return instance;
}
    
}