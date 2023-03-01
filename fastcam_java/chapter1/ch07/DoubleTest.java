package fastcam_java.chapter1.ch07;

public class DoubleTest {
    public static void main(String[] args) {
        // 실수형에 대해 공부해보자. 실수형에는 float, double 두가지가 있다.

        double dnum = 3.14; // double의 표현 범위는 8바이트 (64비트)

        // 8바이트짜리 3.14를 넣으니 표현이 될리가 없다. 이럴때는 float타입으로 전환을 시켜라. F를 붙이고.
        float fnum = 3.14F; // float의 표현범위는 4바이트 (32비트)

        // 하지만 float타입은 64비트 부동소수점 타입인 double에 비해 정밀도가 낮기 때문에 
        // 계산 과정에서 정확성이 떨어질 수 있다. 따라서,
        // 정밀도가 높은 계싼이 필요한 경우에는 double 타입을 사용하는 것이 좋다.

        System.out.println(dnum);
        System.out.println(fnum);
    }
}
