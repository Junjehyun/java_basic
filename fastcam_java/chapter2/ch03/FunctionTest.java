package fastcam_java.chapter2.ch03;
// 함수와 메서드

// 함수란? 하나의 기능을 수행하는 일련의 코드.
// 구현된(정의된)함수는 호출하여 사용하고, 호출된 함수는 기능이 끝나면 제어가 반환됨.
// 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용할 수 있음.
// 자바에서는 그냥 메서드라 부르면 됨.

// 함수는 이름, 매개 변수, 반환 값, 함수 몸체(body)로 구성됨.
// int add(int num1, int num2) {
// int result;
// result = num1 + num2;
// return result;
// }

// 함수 구현하기 예제
public class FunctionTest {

    // 메서드 이름을 addNum으로 정의하고, num1, num2라는 두개의 매개변수를 정의한다.
    // 매개변수는 메서드에 입력으로 전달되는 값을 받아들이는 변수다.
    public static int addNum(int num1, int num2) {
        // 정수형 변수 result 선언
        int result;
        // num1과 num2를 더한 결과를 result에 대입한다.
        result = num1 + num2;
        // result 값을 반환한다.
        return result;
    }

    // 반환값이 없는 경우는 void를 선언한다.
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    // 반환만 하고 매개 변수만 없는
    public static int calcSum() {
        int sum = 0;
        int i;

        for(i = 0; i <= 100; i++) {
            sum += 1;  // sum = sum + 1; 와 같은 의미.
        }
        return sum;
    }
}
