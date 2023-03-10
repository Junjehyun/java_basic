// 01. 변수와 데이터 타입
// 1★변수와 상수
// 2★데이터 타입 (기본 데이터 타입, 참조 데이터 타입)
// 3★형변환

// 변수는 데이터를 저장하기 위한 메모리 공간이다. 변수는 선언 후에 값을 할당 하여 사용한다.
// 변수를 사용하기 위해서는 먼저 데이터 타입을 지정해주어야한다.  (데이터 타입은 하단 설명)
// 변수는 데이터를 저장하기 위한 장소로, 선언 시 타입과 이름을 지정한다. 
// 타입은 변수에 저장될 데이터의 종류를 말한다. 데이터 타입은 기본 데이터 타입과 참조 데이터 타입으로 구분함.



// 1★변수와 상수의 예시 
package basic_course;

public class Basic01 {
    public static void main(String[] args) {
        // 아래는 변수 선언과 동시에 값을 넣은 경우이다.
        String name = "Jun"; // String타입은 문자열을 다루기 위한 데이터타입.  큰 따옴표 써야됨.
        int age = 35; // int는 정수형 데이터타입.

        System.out.println("My name is " + name + " and I am " + age + "years old "); //출력해봄.
        // 결과는 -> My name is Jun and I am 30 years old가 출력된다.

        // 상수는 변수와는 달리 한번 선언되면 그 값을 변경할 수 없다. 상수는 final 키워드를 사용해서 선언함.
        // 변하지 않는 값을 사용할 때 유용하다.
        final int Number = 100;
        // Number변수는 final키워드를 사용하여 상수로 선언 되었다. 이 변수의 값은 100으로 고정되어 있으며 
        // 나중에 변경할 수 없다.  출력을 한번 해보겠다.
        System.out.println("The number is " + Number);
        // The number is 100이 출력된다.

// --------------------------------------------------------------------
// 2★데이터 타입 (기본 데이터 타입, 참조 데이터 타입)
// 기본 데이터 타입 그리고 참조 데이터 타입에 대해 알아보자. 

// Java에서 제공하는 기본 데이터 타입은 다음과 같다.
// 정수형 : byte, short, int, long
// 실수형 : float, double 
// 문자형 : char
// 논리형 : boolean

// Java에서 제공하는 참조 데이터 타입은 다음과 같다. 
// 클래스 : 사용자가 직접 정의한 타입
// 배열 : 같은 타입의 여러 값을 저장할 수 있는 타입
// 인터페이스 : 메서드의 집합을 정의한 타입 -> Animal 인터페이스에 Dog와 Bird객체는 Animal 타입으로 사용된다.
// --------------------------------------------------------------------

// --------------------------------------------------------------------
// 3★형변환
        
//  형변환에 대해.. Java에서는 데이터 타입이 다른 변수끼리 연산을 수행할 수 없다. 이 때, 데이터 타입을 변환하여
// 연산을 수행할 수 있다. 이를 형 변환이라고 한다. 형변환은 자동 형변환과 강제 형변환으로 나뉜다.
// 자동형변환 : 작은 데이터 타입에서 큰 데이터 타입으로의 변환, 실수형에서 정수형으로의 변환등이 가능하다.
        // byte b = 10;
        // int i = b; // 자동 형변환 int는 byte보다 큰 타입이다.
        // 위 처럼 작은 크기 (byte)에서 큰 크기(int)로 자동 형변환이 일어날때는 에러가 나지 않는다. 

// 강제형변환 : 큰 데이트 타입에서 작은 데이터 타입으로의 변환, 정수형에서 실수형으로의 변환 등이 불가능하다. 
// 강제형변환은 (변환할 타입) 변수명 형태로 수행한다.
        int i = 100;
        byte b = (byte) i; // 명시적 형변환
        // int 타입 변수 i의 값은 100이다. byte 타입 변수 b에 이 값을 그대로 할당하면 에러가 날것이다.
        // 이때 강제형변환을 사용하여 int타입 값을 byte 타입으로 변환했다. 하지만 데이터 손실의 가능성이 높음.
        System.out.println(b);
// --------------------------------------------------------------------

    }
}





