package fastcam_java.chapter1;

public class TypeConversionTest {

    public static void main(String[] args) {
    // 형변환 (Type conversion)
    // 개념: 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일 하는것.
    // 종류: 1. 묵시적 형변환 (자동 형 변환), 2. 명시적 형변환(강제 형 변환)이 있음.
    // 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어짐.
    // 덜 정밀한(ex정수) 자료형에서 더 정밀한(ex실수) 자료형으로의 형 변환은 자동으로 이루어짐.

    byte bNum = 125;
    int iNum = bNum;
    // byte(1바이트)보다 int(4바이트)의 값이 더 크기 때문에 문제가 없다. 자동 형 변환
        
    System.out.println(iNum); // iNum을 출력하면 125가 잘 나온다.

    int aNum = 255;
    byte yNum = (byte)aNum;
    // 강제 형 변환의 예이다.
    // int(더 큰 자료형)를 byte(작은 자료형)으로 바꾸려니, 잘 되지 않으니 casting해서 강제로
    // (byte)aNum으로 넣어준다. 이게 바로 강제 형 변환이다. 냉장고가50L인데 물 100L짜리를 넣으려는 상황.
    // 그러니 byte는 -128~127밖에 담지 못한다. 따라서 255는 byte로 표현을 할 수가 없다.
    // 그래서 출력을 해보면 아마 -1로 출력이 될것이다. 데이터 손실로 부정확한 정보가 전달 된것이다. 
    // 이게 강제 형 변환의 단점이다.

    System.out.println(yNum);

    //강제 형 변환 하나만 더 보입시다.
    double tNum = 1.2;
    float kNum = 0.9F;

    int jNum = (int)tNum + (int)kNum;
    int hNum = (int)(tNum + kNum);

    System.out.println(jNum); // 1이 출력
    // 1.2 + 0.9가 되는건데 int로 형변환이 되서 결과적으로 소숫점을 빼고 1+0이 된다. 그래서 1이 나온다.

    System.out.println(hNum); // 2가 출력
    // 1.2와 0.9가 먼저 덧셈 연산을 한 뒤에 int형변환이 이루어진다.
    // 1.2+0.9 = 2.1이 계산 된 후에, int형으로 형 변환되서 소숫점 버리고 2만 남게 되서 2가 나옴.




    }
}
