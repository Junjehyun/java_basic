package fastcam_java.chapter2.ch20;

// 자료를 순차적으로 한꺼번에 관리하는 방법 -> 배열 (Array)
// 배열이란? 동일한 자료형의 순차적 구조
// 인덱스 연산자[]를 이용해 빠른 참조가 가능
// 물리적 위치와 논리적 위치가 동일
// 배열의 순서는 0부터 시작
// 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
public class CharArrayTest {
    // 배열의 선언은 2가지 예가 있다.
    int[] arr1 = new int[10];
    int arr2[] = new int[10];

    // 배열 초기화 하기
    // 배열은 선언과 동시에 자료형에 따라 초기화 됨 (정수는0, 실수는 0.0, 객체는 null)
    // 필요에 따라 초기값을 지정할 수 있음

    int[] numbers1 = new int[] {10, 20, 30}; // 개수 생략해야 함
    int[] numbers2 = {10, 20, 30}; // new int[] 생략가능

    public static void main(String[] args) {

    // 선언 후 배열을 생성하는 경우는 new int[] 생략할 수 없음.
    // int[] ids;
    // ids = new int[] {10, 20, 30}; 






    char[] alphabets = new char[26]; // 알파벳을 저장할 char 배열 생성

    char ch = 'A'; // 변수 ch를 선언하고 문자 'A'를 할당한다.

    for (int i = 0; i < alphabets.length; i++) { // 배열의 길이만큼 반복문 실행
        alphabets[i] = ch++; // 현재 알파벳을 배열에 할당하고 다음 알파벳으로 이동
    }

    for( char alpha : alphabets ) {
        System.out.println(alpha + ", " + (int)alpha);
    }



    }
}
