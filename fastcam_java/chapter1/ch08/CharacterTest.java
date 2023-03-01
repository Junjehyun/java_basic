package fastcam_java.chapter1.ch08;

public class CharacterTest {
    public static void main(String[] args) {
        // 자바는 문자를 나타내기 위해 전세계 표준인 UNICODE를 사용한다.
        // 문자를 위한 데이터 타입 char ch = 'A';
        // 내부적으로 숫자로 표현되므로 숫자를 넣어도 문자가 출력될 수 있음.
        // 작은 따옴표 'A'는 2바이트, 큰 따옴표 "A"는 문자열 두개는 전혀 다름.
        // char 타입은 부호없는 2바이트 데이터 타입이며, 양수범위만 출력 가능(음수는 사용불가)
        // 양수범위인 0~65535까지의 값을 표현

        // 아래 코드는 아스키코드를 이용하여 문자를 숫자로 변환하는 예시이다.
        char ch1 = 'A'; // 변수 ch1에 문자 'A'를 할당
        System.out.println(ch1); // ch1 변수의 값을 출력, 결과는 'A'
        System.out.println((int)ch1); // ch1 변수의 아스키 코드값을 출력한다. ch1 변수를 int형으로 변환하여 출력한다.
        // 출력결과는 '65'가 된다.

        char ch2 = 66; // 변수 ch2에 숫자 66을 넣어봄.

        // ch2는 char타입이므로, 해당 변수에 할당된 값 66이 아스키코드로 해석되 B가 출력.
        System.out.println(ch2);

        //변수 ch2에 할당된 값을 char타입으로 캐스팅한 후 출력, 
        // ch2에 할당된 값인 66은 아스키코드에서 대문자 'B'와 대응하므로, 문자열 B가 출력
        System.out.println((char)ch2);

        int ch3 = 67; // int 정수형 변수로 선언해봄.
        System.out.println(ch3); // int로 당연히 그냥 숫자가 나옴.
        System.out.println((char)ch3); // 강제로 char로 캐스팅 해봄 -> 아스키코드로 변환되서 C가 출력.
    }
}
