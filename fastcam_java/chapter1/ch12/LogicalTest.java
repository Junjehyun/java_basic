package fastcam_java.chapter1.ch12;

public class LogicalTest {
        public static void main(String[] args) {
            //논리연산자: 관계 연산자와 혼합하여 많이 사용 됨.
            // 연산의 결과가 true, false로 변환 됨.
            // &&(논리곱, AND) -> 두 항이 모두 true일 경우에만 결과 값이 true이다. 그렇지 않으면 false
            // ||(논리합, OR) -> 두 항 중 하나의 항만 true면 결과 값은 true다. 두 항이 모두 거짓이면 false
            // ! (부정, NOT) -> 단항 연산자다. 참인 경우는 false로 바꾸고, 거짓인 경우는 true가 된다.
            // 영어의 이중부정문 연상할것.

            int num1 = 10;
            int num2 = 20;

            // num1도 num2도 0보다 크다? -> true
            boolean flag = (num1 > 0) && (num2 > 0);
            System.out.println(flag);

            // num1은 0보다 크고 , num2는 0보다 크다 -> 둘다 맞다 근데 하나만 맞아도 됨 -> true
            flag = (num1 > 0) || (num2 > 0);
            System.out.println(flag);

            // num1은 0보다 작고, num2는 0보다 크다 -> 전자는 틀리고 후자는 맞다 그래도 OR이라 -> true
            flag = (num1 < 0) || (num2 > 0);
            System.out.println(flag);

            // num1은 0보다 크다 맞는말이라서 false가 나온다. 틀린값이 나와야 true가 됨 -> false
            flag =!(num1 > 0);
            System.out.println(flag);
    
 }   
}
