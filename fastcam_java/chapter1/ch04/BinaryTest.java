package fastcam_java.chapter1.ch04;

public class BinaryTest {
    public static void main(String[] args) {
        // 십진수 기준 숫자 10을 각각 십진수, 이진수, 8진수, 16진수로 나눠보자. 참고로 int는 정수형 데이터 타입.

        int num = 10; // 그냥 10진수, num이라는 정수를 선언을 하고 10일 대입했다. 보는 그대로다.
        int bNum = 0B1010; // 2진수, 1010은 10을 표현한다. 0B는 이진수입을 나타내는 접두사.
        int oNum = 012; // 8진수, 숫자앞에 0을 넣으면 8진수다. 0은 8진수임을 나타내는 접두사.
        int xNum = 0XA; // 16진수, 16진수는 A를 나타내며, 십진수로 10이다. 0X는 16진수를 나타내는 접두사.

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

        // 모두 10이 출력이 될것이다. 오늘 공부 끝.
    }
}
