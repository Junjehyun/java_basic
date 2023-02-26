// 03. 제어문
// 1★조건문 (if문, switch문)
// 2★반복문 (for문, while문, do-while문)
// 3★break와 continue문
package basic_course;

public class basic03 {
    public static void main(String[] args) {
// --------------------------------------------------------------------------------------------------------------------        
    // 1★조건문 (if문, switch문)
        int a = 10;
        int b = 5;
        
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    // 위 예시는 a가 b보다 큰지를 비교하고 있다. 조건식 a > b가 true이므로 if문 다음에 있는 코드 블록인
    // "a is greater than b"가 실행되고 결과는 "a is greater than b"가 출력되는걸 확인할 수 있다.
        
    //Switch문은 if문보다 다양한 상황에 대처할 수 있는 조건문이다. switch문은 주어진 변수의 값에 따라 
    // 여러개의 가능한 경우를 처리하는데 사용 됩니다. 주로 열거형(enum)이나 정수형 변수에 사용됩니다.
    // switch문을 활용한 예시를 살펴보자.

        int day = 3;
        // 실수형변수 day에 3을 대입.
        String dayString;
        // String dayString;은 문자열을 저장하기 위한 변수 dayString을 선언하는 코드다.
        // 이 변수는 switch문에서 각 case에 대응되는 문자열을 저장하기 위해 사용된다. 
        // String dayString에서 String은 변수 dayString의 타입을 의미하고, String타입은 문자열을 저장하는
        // 클래스 타입으로, 변수 dayString에는 문자열 데이터가 저장된다. 밑에처럼
        switch (day) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
            break;   
        }
        System.out.println("Today is " + dayString);
    // --------------------------------------------------------------------------------------------------------------------    
    // 2★반복문 (for문, while문, do-while문)
    // 반복문은 프로그램에서 같은 작업을 반복적으로 수행할 수 있도록 해주는 제어문이다. 
    // 주로 for문, while문, do-while문이 사용된다. 예시를 살펴보자.
    // for문 -> for문은 반복횟수가 정해져 있을 때 사용된다. 일반적으로는 다음과 같은 형식으로 작성됨.
    // for (초기값; 조건식; 증감식) {
    // 반복 수행될 코드 
    //}
    // 초기값: 반복문을 시작하기 전에 한 번만 실행되는 코드
    // 조건식: 반복문의 조건을 판단하는 코드, 조건이 true인 동안 반복문이 실행된다. 
    // 증감식: 반복문이 한 번 실행된 후에 실행되는 코드 
    for (int i = 1; i <= 5; i++) {
        // 1부터 5까지 정수를 출력하는 코드. 초기값으로 i를 1로 설정하고, 조건식에서 i가 5보다 작거나
        // 같을동안 반복하고, 반복할때마다 i를 1씩 증가시키기로 함.
        System.out.println(i);
    }
    // while문 
    // while문은 조건식이 true인 동안 반복한다. 다음과 같은 형식으로 작성된다.
    // while (조건식) {
    // 반복 수행될 코드     
    // } 
    int e = 1;
    while (e <= 5) {
        System.out.println(e);
        e++;
    }
    // 위 코드는 1부터 5까지의 정수를 출력하는 코드다. while문에서는 반복횟수를 정해주는 초기값과
    // 증감식이 따로 필요하지 않다. 초기값으,로 e를 1로 설정후, 조건식에서 e가 5보다 작거나 같을동안
    // 반복하도록 하고, 반복할때마다 e를 1씩 증가시켰다. 

    // do-while문 
    // do-shile문은 while문과 비슷하지만, 조건식을 먼저 검사하지 않고 일단 한 번은 코드를 실행한 후에 조건식을 
    // 검사한다. 다음과 같은 형식으로 작성된다. 
    int w = 1;
    do {
        System.out.println(w);
        w++;
    } while (w <= 5);
    //위 코드도 1부터 5까지의 정수를 출력하는 코드다. do-while문에는 반복횟수를 정해주는 초깃값과 증감식이
    // 따로 필요하지 않다. 일단 한번은 코드를 실행한 후에 w가 5보다 작을동안 계속해서 코드를 반복실행.
    // 따라서 do-while문은 조건식이 false일지라도 한번은 반드시 실행되는 특징이 있다. 

    // --------------------------------------------------------------------------------------------------------------------    
    // 3★break와 continue문 (머리아프다 내일하자 *내일은 반복 위주로* 오늘날짜 230223)
    }
}
