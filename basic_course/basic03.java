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
    // 여러개의 가능한 경우를 처리하는데 사용 됩니다. 주로 열거형(enum)이나 정수형 변수에 사용된다.
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
    // 3★break와 continue문 
    // break문은 반복문(for, while, do-while)이나 switch문에서 사용되며, 실행 중인 블록을 즉시 종료시킨다.
    
    // for문에서 break문을 만나면, 해당 반복문이 완전히 종료되고, 반복문 이후의 코드가 실행된다.

    // 0부터 9까지의 정수를 출력하되, i가 5일때 break문을 사용하여 반복문을 종료하는 코드다.
        for (int i = 0; i < 10; i++) { //for문이 시작되면, 변수 i를 0으로 초기화 한다.
            if (i == 5) { // 조건식 i < 10이 true이므로  반복문 안의 코드 블록을 실행.
                break; // if문에서 i == 5 를 판단하고, i가 5이므로 break문이 발동되어 반복문을 빠져나간다.
            }
            System.out.println(i); // 4가 출력.
        }
        System.out.println("loop ended");  // Loop end가 출력.

    // while문에서 break문을 만나면, while문의 조건식 평가 결과가 false가 되어, while문이 종료되고, while문
    // 이후의 코드가 실행된다.
    // while문에서 break문은 반복문을 중단 시키는 역할을 한다. while문 안에서 특정 조건을 만족하면 반복문을
    // 종료 시키고, 다음 코드를 실행한다. 

        int i = 0; // 정수형 변수 i 선언과 동시에 0 넣음.
        while (i < 10) { // 변수 i가 10보다 작을때까지 반복해라는 의미.
            if (i == 5) { // 만약 i가 5와 같게된다면...
                break; // break문을 실행시켜서 멈춰라..
            }
            System.out.println(i); // 4까지 출력 될것이다.
            i++; // i를 1씩 증가시킨다.
        }
        System.out.println("Loop ended"); // Loop ended가 출력 될것이다..

    
    // do-while문에서 break문을 만나면, do-while문의 조건식 평가 결과가 false가 되어, do-while문이 종료되고,
    // do-while문 이후의 코드가 실행 된다.
    // do-while문은 조건식을 마지막에 평가하기 때문에, do 블록 안의 코드는 최소 한번은 실행된다.
    // 그래서, do-while문에서 break문을 사용하면, 반복문을 즉시 종료하고, do-while문 다음의 코드로 제어가 이동.
    // 예를들어 다음 코드에서는 do-while문을 사용하여, 0에서 9까지의 정수를 출력하면서 i가 5일때 반복문 종료.

        int t = 0; // 변수t선언과 동시에 0대입
        do { // do-while문 시작점
            System.out.println(t); // 현재 t값을 한번 출력.
            t++; // t의 값을 1씩 증가. 일단 출력해보고 증가시키네? do-while은 조건식을 마지막에 평가하는 특징이 있다.
            if (t == 5) { // t가 5가 되면 break문을 통해 루프를 중단한다.
                break; // break !
            }
        } while (t < 10); // do-while문의 끝점이다. t값이 10보다 작은동안 계속해서 루프 반복.
        System.out.println("Loop ended"); // 루프가 종료되면 Loop ended를 출력.


    // switch문에서 break문을 만나면, 해당 case 문을 실행하고, switch문을 빠져나온다. break문이 없다면,
    // 해당 case 문을 실행한 이후의 모든 case 문을 실행하게 된다.
    // 일반적으로 switch문에서 case문은 fall-through라는 특징이 있어서, 해당 case문이 실행된 이후에 
    // 다음 case문도 차례로 실행된다. 그러나, break문이 사용된 case문은 해당 case문이 실행된 후에 
    // switch문을 빠져나가게 되어, 다음 case문은 실행되지 않는다. 이를 이용하면, 특정 조건이 충족될때
    // switch문을 빠져나가게 할 수 있다.  예시를 살펴보장

    int num = 2; // 정수형 변수 num에 2를 할당.

    switch (num) { // num의 값에 따라 분기하는 'switch' 문을 시작한다.
        case 1: // num이 1인 경우 다음 문장을 실행한다.
        System.out.println("num is 1"); // num is 1이 출력됨.
        break; // switch문 종료한다.

        case 2:
        System.out.println("num is 2");
        break;

        case 3:
        System.out.println("num is 3");
        break;

        default: //num이 1,2,3 중 하나가 아닌 경우, 다음 문장을 실행한다.
        System.out.println("num is not 1, 2, or 3");
        break;
        // 결론 num2가 출력된다. 변수 num에 2가 할당 되어 있기 때문에 switch문에서 case가 실행된다.
        // case2 에서는 num is 2를 출력하고, break문을 통해 switch문을 종료한다. 
    }

       // continue문을 공부해보자. 
       // continue문은 반복문(while, for문 등) 내에서 사용되며, 현재 실행 중인 반복 회차를 종료하고 
       // 다음 회차로 진행되는 키워드이다.  'break' 문과 비슷하지만, continue는 현재 반복 회차에서
       // 다음 회차로 진행하고자 할때 사용. 
       // continue문이 실행되면, 반복문 내부에서 해당 'continue'문 이후의 코드는 실행되지 않고, 
       // 반복문의 증감식 혹은 다음 조건 검사식으로 넘어가 다음 회차를 실행. 

       for (int j = 0; j < 10; j++) {
        if (j == 5) {
            continue; // 그냥 5 건너 뛰고 6부터 다시 감.
        }
        System.out.println(j);
       }

       // 위 코드에서 continue문은 j가 5일 때 현재 반복 회차를 종료하고, 다음 회차로 넘어가서 실행된다.
       // 따라서 출력 결과는 0부터 9까지 숫자중에 5를 제외한 숫자가 차례대로 출력됨.

    }
}