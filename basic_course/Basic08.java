// 8. 예외처리
// 1★예외 처리 개념과 구현
// 2★try-catch-finally 문
// 3★예외 클래스와 예외 처리의 계층 구조
// 4★throws 키워드
package basic_course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Basic08 {

public static void main(String[] args) {
// 1★예외 처리 개념과 구현
// 예외 처리(Exception Handling)는 프로그램 실행 도중 예기치 않은 상황(오류, 예외)등이 발생할 때,
// 그 상황을 처리하는 방법을 말한다.
// 예를 들어, 파일을 읽어들이는 코드에서 파일이 없거나 경로에 문제가 있을 경우 IOException이 발생한다.
// 이때 IOException을 처리하지 않으면, 프로그램이 예외 상황으로 중단된다.

// 2★try-catch-finally문
// Java에서는 try-catch-finally 구문을 사용하여 예외를 처리한다. try 블록안에는 예외가 발생할 
// 가능성이 있는 코드를 넣고, catch 블록 안에는 예외가 발생했을 때 실행될 코드를 넣습니다.
// 마지막으로 finally 블록 안에는 예외 발생 여부와 상관없이 실행될 코드를 넣는다.

// 예를 들어, 파일을 읽어들이는 코드에서 IOException이 발생할 경우, 다음과 같이 예외처리가 가능하다.


//       try {
//         // 파일을 읽어들이는 코드
//      FileInputStream fis = new FileInputStream("file.txt");
//      // ...
//      } catch (IOException e) {
//          // 예외가 발생하면 실행되는 코드
//          System.out.println("파일을 읽어들이는 동안 오류가 발생했습니다.");

//      } finally {
//          // 예외 발생 여부와 상관없이 실행되는 코드
//          // System.out.println("예외 처리가 끝났습니다.");
//          }
}
// 위 코드에서 try 블록 안에서 파일을 읽어들이는 코드가 발생한다. 만약 IOException이 발생하면,
// catch 블록 안에서 오류 메시지를 출력하고, 예외의 상세한 정보를 출력한다. 마지막으로
// final 블록 안에는 예외 발생 여부와 상관없이 "예외 처리가 끝났습니다." 메시지를 출력하게 된다.

//-----------------------------------------------------------------------------------------------

// 3★예외 클래스와 예외 처리의 계층 구조
// Java에서는 예외 클래스와 예외 처리를 위한 계층 구조를 가지고 있다. 이는 예외 처리의 유연성과 확장성을
// 높이는데 도움이 된다. 예외 클래스는 Throwable 클래스를 상속하며, 대표적으로는 Exception과 Error이 있다.

// Exception은 일반적으로 프로그램 실행 중에 발생할 수 있는 예외 상황을 나타내며, 이러한 예외는 프로그램에서
// 처리될 수 있다. Exception 클래스는 다시 RuntimeException과 그 외의 예외로 나눈다.

// RuntimeException은 주로 프로그래머의 실수에 의해 발생하는 예외이며, 컴파일러가 체크하지 않는다.
// 대표적으로 NullPointerException, IndexOutOfBoundsException 등이 있다.
// 그 외의 예외는 컴파일러가 체크하며, 처리가 필수적 이다. 대표적으로 IOException, ClassNotFoundException
// 등이 있다.

// Error는 일반적으로 시스템 레벨에서 발생하는 예외 상황을 나타내며, 프로그램에서 직접 처리할 수 없다. 
// 대표적으로 OutOfMemoryError, StackOverflowError 등이 있다. 

// 예외 처리의 계층 구조는 try-catch문을 사용하여 예외를 처리할 때, catch문에서 처리할 예외 클래스를 
// 명시함으로써 구현된다. 이때, 예외 처리의 순서는 자식 클래스부터 처리하는 것이 일반적이다. 예를 들어,
// Exception을 상속하는 IOException이 있을 경우, IOException을 먼저 처리하고, 그 다음에 Exception
// 을 처리하는 것이 좋다.

// 예외 처리의 순서는 다음과 같다.
// 구체적인 예외를 처리하는 catch문을 먼저 작성한다.
// 구체적인 예외를 처리하는 catch문이 없으면 상위 예외 클래스를 처리하는 catch문으로 이동한다.
// try 블록에서 예외가 발생하지 않으면, catch문을 건너 뛰고 finally 블록으로 이동한다.


//-----------------------------------------------------------------------------------------------
// 4★throws 키워드
// throw 키워드는 메서드에서 예외를 처리하지 않고 호출한 쪽으로 예외를 던지는 역할을 한다.
// 예외를 던지는 메서드는 'throw' 키워드를 이용해 해당 예외를 던진다는 것을 알려주어야 한다.
// 예를 들어, 다음과 같이 파일을 읽는 메서드를 만들었다고 가정해보자.
public static void readFile(String fileName) throws FileNotFoundException, IOException {
    FileInputStream fis = new FileInputStream(fileName);
    // 파일을 읽는코드
    // ..
    fis.close();

// 위 메서드에서는 'fileNotFoundException'과 'IOException'을 던질 수 있다. 
// 하지만 이 메서드에서는 예외를 직접 처리하지 않고, 'throws' 키워드를 이용해 예외를 호출한 쪽으로 던진다.

// 이제 이 메서드를 호출할 때는 다음과 같이 처리한다.
    try {
        readFile("file.txt");
    } catch(FileNotFoundException e) {
        System.out.println("파일을 찾을 수 없습니다.");
    } catch (IOException e) {
        System.out.println("파일을 읽는 동안 오류가 발생했습니다.");
    }
// 위 코드에서 readFile 메서드는 throws 키워드를 이용해 예외를 던졌기 때문에, 해당 메서드를 호출하는
// 쪽에서는 반드시 예외를 처리해야 한다. 이를 위해 try-catch 구문을 이용해 예외 처리를 한다.

// 'throws' 키워드를 이용해 예외를 던질 때, 해당 예외가 반드시 처리되어야 하는것은 아니다. 
// 즉 'throws'키워드를 이용해 예외를 던져도 호출한 쪽에서 예외 처리를 하지 않을 수도 있다. 
// 이 경우, 예외는 호출한 쪽으로 계속 전파되어 최종적으로는 JVM에 의해 처리된다.
}


    

}


