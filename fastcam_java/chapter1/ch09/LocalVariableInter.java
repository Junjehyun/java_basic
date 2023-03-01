package fastcam_java.chapter1.ch09;

public class LocalVariableInter {
    public static void main(String[] args) {
        
        // 지역변수란? 특정한 코드블럭 {} 내에서 선언되고 사용되는 변수이다.
        // 메소드 안에서 선언된 변수는 그 메소드 내에서만 사용될 수 있다.
        // 지역변수는 메소드의 매개변수, 메소드 내부에서 선언된 변수, 블록 내에서 선언된 변수등
        // 지역변수는 선언된 블록 내에서만 사용 가능하기 때문에 블록 외부에서는 접근할 수 없다.
        // 또한 지역변수는 사용되기전에 반드시 초기화 되어야한다.

        var i = 10; // int 
        var j = 10.0; // double
        var str = "hello"; // string

        // str=3; 이미 String으로 설정이 된걸 숫자로 바꿀순 없다.

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
    }
}
