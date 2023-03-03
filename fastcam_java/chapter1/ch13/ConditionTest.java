package fastcam_java.chapter1.ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        // 조건 연산자에 대해 공부해보자.
        // 삼항 연산자 -> 조건식의 결과가 true인 경우와, false인 경우에 따라 다른 결과가 수행됨.
        // if(조건문)을 간단히 표현할 때 사용할 수 있음.

        // Scanner라는 놈을 써보려고 입력을 받아봄
        // Scanner는 java.util이라는 패키지 안에 있음.
        // System.in이라는건 표준 입력 (System.out은 표준출력)

        // 아래 코드는 사용자로부터 정수를 입력받아 출력하는 코드다.
        // 'Scanner' 클래스는 키보드 입력을 받아오기 위한 클래스다. 'Scanner' 클래스 객체를 생성 후,
        // 'nextInt()' 메소드를 호출하면 정수형 데이터를 입력 받을 수 있다.
        // 입력받은 정수는 'num'변수에 저장된다.
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        //이 구문은 입력받은 정수를 출력하는 것이다.
        System.out.println(num);

        // Scanner 객체를 사용 후 명시적으로 close()메서드를 호출해 자원을 반환해야 한다.
        // 자원 누수 문제를 방지하기 위한 차원에서 
        scanner.close();
    }
}
