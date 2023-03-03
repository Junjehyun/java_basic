package fastcam_java.chapter1.ch19;

public class ForTest {
    public static void main(String[] args) {
        // 반복문 for
        // 수행순서
        // for (초기화식; 조건식; 증감식) {
        // 수행문;
        // }
        // 1부터 10까지 더한 결과를 출력해보자.

        int count = 1; // count라는 변수 1로 초기화
        int sum =0; // sum이라는 변수 0으로 초기화

        //초기식 : i변수를0으로 초기화
        // 조건식 : i변수가 10보다 작을때까지 반복하도록,
        // 증감식 : i변수를 1씩 증가하면서 반복, count도 함께 증가 
        for ( int i = 0; i<10; i++, count++) {
            sum += count; // count변수를 1부터 10까지 증가시키면서 sum변수에 더해준다.
        }
        System.out.println(sum);

        //참고사항
		// i+1과 i++은 다르다.
		// i+1자체는 i값이 증가되지 않는다. 증가하기 위해서는 대입연산자를 써야한다.
		// 하지만 i++은 i = i+1, i+=1과 같은 의미다.
		// 따라서 값을 1씩 증가하려고 한다면 i++을 사용해라.
    }
}
