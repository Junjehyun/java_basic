package fastcam_java.chapter1;

public class OperatorTest {
    public static void main(String[] args) {

        int gameScore = 150;

        int lastScore = ++gameScore;
        // gameScore += 1; gameScore = gameScore +1; 의 의미와 같다. 
        // ++이 먼저 들어갔으니, 먼저 1이 증가되고 gameScore값이 도출된다. 그래서 151이 나옴.

        // int lastScore = gameScore++; 이건 ++을 뒤로 붙인 상황이다.
        // gameScore값이 도출되고 나서 1을 증가해준다. 그래서 150

        System.out.println(lastScore);
        System.out.println(gameScore);

        // gpt 해석
		//위의 코드에서 ++gameScore는 증가된 값을 반환하고,
		//gameScore++는 현재 값을 반환한 후에 1을 증가시킵니다.
		
		//따라서 int lastScore = ++gameScore라는 코드는 gameScore를 1 증가시킨 다음 
		//그 값을 lastScore에 할당합니다. 이 경우에는 gameScore와 lastScore 모두 151이 됩니다.

		//반면에 int lastScore = gameScore++라는 코드는 gameScore의 현재 값을 lastScore에
		//할당한 후에 gameScore를 1 증가시킵니다. 따라서 이 경우에는 gameScore가 151이 되고, 
		//lastScore는 150이 됩니다.
    }
}
