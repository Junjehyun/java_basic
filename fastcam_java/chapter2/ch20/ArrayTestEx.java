package fastcam_java.chapter2.ch20;

public class ArrayTestEx {
    public static void main(String[] args) {
    // 배열 사용하기
    // [] 인덱스 연산자 활용 - 배열 요소가 저장된 메모리의 위치를 연산하여 찾아줌
    // 배열을 이용해서 합을 구해보자

    // 길이가 10인 int형 배열을 생성한다. 배열의 이름은 arr
    int[] arr = new int[10];
    // int형 변수 total을 선언하고 0으로 초기화 한다.
    int total = 0;

    // for문을 이용하여 배열 arr의 각 인덱스에 1부터 10까지의 값을 저장한다.
    // 루프 변수 i는 0부터 배열의 길이보다 작을때까지 1씩 증가하며, 그럼 9 ?
    // 변수 num은 1부터 시작하여 루프가 실행될 때마다 1씩 증가한다. 
    // 배열의 각 인덱스에는 현재 num값이 저장된다.

    for(int i=0, num=1; i< arr.length; i++, num++) {
        arr[i] = num;
    }

    // for문을 이용하여 배열 arr의 모든 요소를 더한 후, 변수 total에 저장
    // 루프 변수 i는 0부터 배열의 길이보다 작을때까지 1씩 증가하며,
    // 배열의 각 요소의 값을 더하여 변수 total에 누적한다.

    for(int i = 0; i<arr.length; i++) {
        total += arr[i];
    }

    System.out.println(total);

    }
}
