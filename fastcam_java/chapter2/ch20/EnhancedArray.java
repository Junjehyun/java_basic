package fastcam_java.chapter2.ch20;

public class EnhancedArray {
 public static void main(String[] args) {

    // 예를들어 int형 배열 arr에 요소가 저장 되어 있다고 가정해본다.
    int[] arr = {1,2,3,4,5};

    // 이 배열에 저장된 요소들을 향상된 for문을 사용하여 출력해보면 다음과 같다.

    for (int num : arr) {
        System.out.println(num);
    }
    // 위 코드에서 'int num'은 배열 arr에 저장된 요소를 하나씩 꺼내서 변수 num에 대입
    // 이후 코드 블록에서 변수 num을 사용하여 요소를 처리한다.
    
 }   
}
