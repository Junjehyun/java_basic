package fastcam_java.chapter1.ch13;

public class BitOperationTest {
    public static void main(String[] args) {
        // 비트 연산자
        // 마스크 : 특정 비트를 가리고 몇 개의 비트 값만 사용할 때
        // 비트 켜기 : 특정 비트만을 1로 설정해서 사용하고 싶을 때
        // 예) & 00001111 (하위 4비트중 0인 비트만 0으로 만들기)
        // 비트 끄기 : 특정 비트만을 0으로 설정해서 사용하고 싶을 때
        // 예) |11110000 (하위 4비트 중 0인 비트만을 0으로 만들기)
        // 비트 토글 : 모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 때

        int num1 = 5; // 00000101            ※8421연상할것※
        int num2 = 10; // 00001010          ※8421연상할것※

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);


    }
}
