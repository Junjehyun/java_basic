package fastcam_java.chapter1.ch21;

public class BreakTest {
    public static void main(String[] args) {
        // Break문 사용하기
        // 감싸고 있는 제어문의 블록을 빠져 나오는 기능 (switch문에서도 사용)
        // 반복문에서는 주로 조건문(if)와 같이 사용하여 조건에 해당되는 경우 반복 수행을 멈추고
        // 반복문 외부로 수행이 이동
        // 여러 반복문이 중첩되어 있는 경우에는 break문이 포함되어 있는 반복문만 빠져나옴

        // 1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력해라

        // 변수 sum을 0으로 초기화
        int sum = 0;
        // 변수 num을 선언
        int num;
        for ( num = 1; ; num++) { // num을 1로 초기화 하고, 무한루프라 조건식 비워두고, num이 1씩 증가하도록
            // num을 sum에 더한다
            sum += num;
            // 만약 sum이 100 이상 되면, break문을 사용하여 for 루프를 빠져나간다.
            if( sum>=100 ) break;

        }
        //for루프가 끝난 후 sum을 출력
        System.out.println(sum);
        //for 루프가 끝난 후, 더한 num값 출력
        System.out.println(num);
    }
    
}
