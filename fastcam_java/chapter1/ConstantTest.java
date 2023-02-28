package fastcam_java.chapter1;

public class ConstantTest {
    public static void main(String[] args) {
        // 상수(Constant) 선언하기.. 상수란? 
        // 변하지 않는 수를 말한다. 
        // 원주율 3.14, 1년은 12개월이라는 것 등등.. 

        // final 예약어를 사용하여 선언, 다른 변수형이랑 구분하기 위해 대문자로 변수를 많이 만든다.
        // 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고,
        // 혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음.
        // ex) 우리반 학생이 30명이면 final int numberOfStudent = 30; 으로 정해져있다면
        // 근데 갑자기 5명이 전학이 왔다? 그냥 최초 선언부분 즉, final int numberOfStudent = 35; 
        // 이렇게 고쳐주기만 하면 된다.

        final int MAX_NUM = 100; // 상수 MAX_NUM에 100을 대입했다.
        // 혹시 이렇게 100으로 선언했는데도 불구하고, 
        // MAX_NUM = 200; 이렇게 하면 오류가 난다. 이미 위에 100을 선언했기 때문이다. 그리고

        final int MIN_NUM; // 이렇게 변수명만 넣어주고

        MIN_NUM = 0; // 나중에 대입해줘도 괜찮다.
        
        System.out.println(MAX_NUM); // 100출력
        System.out.println(MIN_NUM); // 0출력

        // 리터럴 : 프로그램에서 사용하는 숫자, 문자, 논리값을 포함
        // 리터럴은 상수 풀(Constant Pool)에 있음.
        // 정수 리터럴은 int로 실수 리터럴은 double로 저장됨.
        // 정수의 범위가 넘어가는 경우는 L,l으로 float으로 사용하는 경우는 F,f 식별자를 써줘야함.

    }
}
