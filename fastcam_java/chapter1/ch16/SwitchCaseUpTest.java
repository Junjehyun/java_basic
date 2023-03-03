package fastcam_java.chapter1.ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {
    public static void main(String[] args) {
        // java12부터 추가된 switch expression이라는 기능을 사용한 코드를 보자.
        //  좀 더 간결하고 가독성이 좋은 코드를 작성할 수 있다. case문에서 반환값을 직접 지정할 수 있다.
        // 이전에는 반환값을 변수에 할당한 뒤 break문으로 switch를 빠져나가야 했지만, switch expression
        // 에서는 반환값을 yield 키워드로 지정 가능하다.
        // 또 여러값이 동일한 결과를 반환하는 경우에는 쉼표로 구분해서 case문을 작성할 수 있다.

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        //int month = 3;
		int day = switch (month) {
            //기존과 다르게 case를 쉼표로 구분해서 쓸수도있다.
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            case 2 -> {
                yield 28;
            } 
            default -> {
                System.out.println("존재하지 않는 달 입니다.");
                yield -1;
                }
            };
            System.out.println(month + "월은 " + day + "일입니다.");
            
            scanner.close();
    }
}
