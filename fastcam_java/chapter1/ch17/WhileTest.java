package fastcam_java.chapter1.ch17;

public class WhileTest {
    public static void main(String[] args) {
        // while문에 대해서 공부하자.
        // 주어진 조건에 맞는 동안(true) 지정된 수행문을 반복적으로 수행하는 제어문
        // 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
        // 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false로 판단됨.
        // ex)달리는 자동차, 일정 횟수 만큼 돌아가는 나사못, 특정 온도까지 가동되는 에어컨.
        // 수행문을 수행하기 전 조건을 체크하고 그 조건의 결과가 true인 동안 반복문을 수행한다.

        // 1부터 10까지 더하여 그 결과를 출력해보자.
        int num = 1; // 변수 num을 1로 초기화 한다.
        int sum = 0; // 변수 sum을 0으로 초기화 한다.

        while( num <= 10) { // num이 10이하일 때까지 반복한다. 즉  while문을 빠져나오는 순간 num의 값은 11이 될것.

            sum += num; // 첫번째 반복에서 sum에 num을 더한다.

            num++; // 그리고 num을 1씩 증가 시킨다. 이때 sum은 1이 되고, num은 2가 된다.
        }

            System.out.println(sum); // 55출력
            System.out.println(num); // 11출력
    }
}

            // 헷갈릴 수 있어서 반복문 계산을 한번 적어본다. 출처 gpt
		// 코드에서 while문을 실행하면 num은 1부터 시작하여 10까지 1씩 증가합니다. 
		// 즉, num의 값은 마지막 반복에서 11이 됩니다.

		// sum은 초기값이 0으로 설정되어 있고, while문에서는 반복할 때마다 sum에 num의 값을 더합니다. 
		// 즉, 반복문을 실행하면서 sum은 다음과 같이 계산됩니다.

		//	 num = 1일 때: sum = sum + num = 0 + 1 = 1
		//	 num = 2일 때: sum = sum + num = 1 + 2 = 3
		//	 num = 3일 때: sum = sum + num = 3 + 3 = 6
		//	 num = 4일 때: sum = sum + num = 6 + 4 = 10
		//	 num = 5일 때: sum = sum + num = 10 + 5 = 15
		//	 num = 6일 때: sum = sum + num = 15 + 6 = 21
		//	 num = 7일 때: sum = sum + num = 21 + 7 = 28
		//	 num = 8일 때: sum = sum + num = 28 + 8 = 36
		//	 num = 9일 때: sum = sum + num = 36 + 9 = 45
		//	 num = 10일 때: sum = sum + num = 45 + 10 = 55