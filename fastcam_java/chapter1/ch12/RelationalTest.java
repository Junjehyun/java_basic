package fastcam_java.chapter1.ch12;

public class RelationalTest {
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;
    
        // 비교연산자인 '>'를 이용하여, 변수 num1과 num2 를 비교한 결과를 boolean타입의 변수
        // value에 저장하고 있다.
        boolean value = (num1 > num2); // num1은 num2보다 크다 -> true
        System.out.println(value);

        System.out.println(num1 < num2); // num1은 num2보다 작다 -> false
        System.out.println(num1 >= num2); // num1은 num2보다 크거나 같다 -> ture
        System.out.println(num1 <= num2); // num1은 num2보다 작거나 같다 -> false
        System.out.println(num1 == num2); // num1은 num2랑 같다 -> false
        System.out.println(num1 != num2); // num1은 num2랑 같지 않다 -> true
    }
    
}
