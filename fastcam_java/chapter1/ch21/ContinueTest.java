package fastcam_java.chapter1.ch21;

public class ContinueTest {
    public static void main(String[] args) {
        // Continue문 사용하기
        // 반복문 내부에서 조건문(if)와 같이 사용하며, 조건이 맞는 경우면 이후 반복문 블럭 내부의 
        // 다른 수행문들을 수행하지 않음.

        // 1부터 100까지 숫자 중 3의 배수를 출력해보자.

        int num; // int형 변수 num을 선언한다.
        for (num = 1; num <= 100; num++) { // for루프를 이용해서 num를 1부터 100까지 1씩 증가하면서 반복.

            // 만약 num을 3으로 나누었을 때 나머지가 0이 아니면,
			// 현재 실행중인 루프를 건너뛰고 다음 루프 실행.
            if((num % 3) != 0) continue;

            // num이 3으로 나누어 떨어지면, 그 값을 출력
            System.out.println(num);
        }

    }
    
}
