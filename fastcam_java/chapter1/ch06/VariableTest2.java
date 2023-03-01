package fastcam_java.chapter1.ch06;

public class VariableTest2 {

    public static void main(String[] args) {
     
    // ★정수형 데이터 타입★
    // byte : 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
    // byte의 표현 범위는 -128~127까지 표현 가능하다.
    byte bnum = -128;
    System.out.println(bnum);

    // short: 2바이트 단위의 자료형 C/C++ 언어와 호환시 사용
    
    // int: 4바이트 단위의 자료형, 자바에서 사용하는 정수에 대한 기본 자료형
    // 프로그램에서 사용하는 모든 숫자(리터럴)은 int로 저장됨, 32비트를 초과하면 long으로 처리

    // Long: 8바이트 자료형, 숫자의 뒤에 알파벳 L또는 l을 써서 long형임을 표시함.
    // ex) int num = 12345678900; 오류 -> int가 표현할 수 있는 숫자의 범위를 넘어섬.
    // ex) long lnum = 12345678900; 오류 -> 숫자의 범위를 넘어섬 -> long형으로 잡아야됨.
    // ex) long lnumber = 12345678900L; OK -> L형으로 표시해서 제대로 됨.

    }
}
