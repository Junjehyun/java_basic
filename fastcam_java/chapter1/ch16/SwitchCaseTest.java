package fastcam_java.chapter1.ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    
    public static void main(String[] args) {
        // 조건이 여러 개 일때 간단히 표현되는 switch-case문 

        // switch - case 문
        // if - else if - else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현한다.
        // 비교 조건이 특정 값이나 문자열인 경우 사용
        // break문을 사용하고 각 조건이 만족되면 swtich 블럭을 빠져나오도록 함.
        // 자바 14부터 좀 더 간결해진 표현식이 지원 됨 (break 사용하지 않음.)

        // 한달이 며칠인지 알려주는 간단한 프로그램 구현해보자
        // 스캐너를 활용해보자. System.in은 입력할 때 쓰는것
        Scanner scanner = new Scanner(System.in);
        // Scanner.nextInt(System.in);는 사용자로부터 입력받은 값을 정수로 변환하여 반환한다.
        // 변환된 값을 변수 month에 저장하여 출력문에서 사용함.
        int month = scanner.nextInt();

        // switch-case문 시작 -> month 변수값에 따라 day 변수를 초기화 한다.

        int day;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31; // 1월, 3월, 5월, 7월, 8월, 10월, 12월
                break; // break를 써야 switch case문을 빠져나갈 수 있다.
            case 2:
                day = 28; // 2월
                break;
            case 4: case 6: case 9: case 11:
                day = 30; // 4월, 6월, 9월, 11월
                break;
                // month 변수의 값이 1~12가 아닌경우 디폴트 값.
                default:
                System.out.println("존재하지 않는 달입니다.");
                day = 1;
        }
            System.out.println(month + "월은" + day + "일 입니다.");

            scanner.close();

    }
}
