package fastcam_java.chapter1.ch13;

import java.util.Scanner;

public class ConditionTest2 {
    public static void main(String[] args) {
        // 아래 코드는 사용자로부터 두 개의 정수를 입력받고, 입력 받은 두 수 중 큰 수를 출력하는 코드.
        // 먼저 Scanner클래스를 이용하여 사용자로부터 입력 받는다.

        // 그리고 "두 수를 입력 받아서 더 큰 수를 출력하세요" 메세지를 출력하고,
        // 첫 번째 수와 두 번째 수를 입력 받는다.
        // \n은 줄바꿈(new line)을 의미하는 이스케이프 시퀀스(escape sequence)
        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1:"); // 여기에 10을 입력하고
        int num1 = scanner.nextInt();
        System.out.println("입력 2:"); // 여기에 20을 입력한다 ? 밑에 출력으로 가면 20이 출력된다.
        int num2 = scanner.nextInt();

        // 조건 연산자를 이용하여, 입력받은 두수 중 큰 수를 max 변수에 저장하고, 출력한다.
        max = (num1 > num2)? num1 : num2;
        System.out.println(max);

        scanner.close();

    }
}
