package fastcam_java.chapter1.ch20;

public class NestedLoopTest {
    public static void main(String[] args) {
        // 중첩 반복문이란?
		// 반복문 내부에 또 다른 반복문이 있음.
		// 여러 겹으로 반복문을 겹쳐서 구현 가능 (단 수행시간에 문제가 발생할 수 있음)
		// 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의하며 구현해야 함

        // 구구단을 for로 만들어보자

        // 단 2x1의 2
        int dan = 2;
        // 뒷 곱 2x1의 1
        int count =1;
        // 바깥쪽 for가 단이고 안쪽 for가 곱해지는 값들
        for( dan = 2; dan <= 9; dan++) {

            for(count = 1; count <= 9; count++) {
                System.out.println(dan + "X" + count + "=" + dan * count);
            }
            System.out.println();// 이거 해놓으면 단마다 한줄 띈다.
            // OK for문을 활용한 구구단은 이해했다. 난또나꾸
        }

        // 구구단을 while로 만들어보자.

        // dan 2로 초기화
        dan = 2;
        // dan이 9보다 작거나 같을 때까지 반복
        while ( dan <= 9) {
            // 카운트 1로 초기화
            count = 1;
            // count가 9보다 작거나 같을 때까지 반복
            while ( count <= 9) {
                // 구구단 출력문이다.
                System.out.println( dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
  
    }
}
