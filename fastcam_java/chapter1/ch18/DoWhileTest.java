package fastcam_java.chapter1.ch18;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        // 반복문 do-while문을 공부하자.
        // 조건과 상관없이 한번은 수행문을 수행한다. (while문과 가장 큰 차이)
        // while문은 조건을 먼저 체크하고 반복문이 수행된다면, do-while문은 조건과 상관없이 수행을 한 번 하고
        // 조건을 체크한다.

        // 하단 예제는 입력받는 모든 숫자의 합을 구하는 예제, 단 입력이 0이 되면 반복을 그만하고 합을 출력

        // Scanner 클래스를 이용하여 scanner 객체 생성 -> 사용자가 키보드로 입력한 값을 읽어들임.
        Scanner scanner = new Scanner(System.in);
        // 입력받은 값을 저장할 변수 input을 선언.
        int input;
        // 더해진 숫자들의 합을 저장할 변수 sum을 선언하고 0으로 초기화
        int sum = 0;

        // do-while문을 시작
        // do-while문은 조건을 먼저 확인하지 않고, 먼저 한번 실행한 후에 조건을 확인한다.
        // 따라서 사용자의 입력 값에 상관없이 최소한 한 번은 반복문이 실행된다.
        do {
            // 정수값을 입력 받아 input 변수에 저장한다.
            input = scanner.nextInt();
            // 입력 받은 값 input을 sum 변수에 저장한다.
            sum += input;
            // 0을 입력할 때 까지 입력을 반복, 따라서 입력받은 값이 0인 경우에는 반복문이 종료된다.
        } while (input != 0);

            // 마지막으로 입력받은 모든 숫자의 합인 sum값을 출력한다.
            System.out.println(sum);
            scanner.close();
    }
}
