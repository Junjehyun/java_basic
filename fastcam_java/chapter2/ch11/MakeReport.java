package fastcam_java.chapter2.ch11;
// 캡슐화 (Encapsulation) 
// 정보은닉을 활용한 캡슐화
// 정보를 감싸서 외부에 꼭 필요한 정보와 기능만 오픈함.
// 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만은 제공하여, 일관된 기능을 구현하게 함.
// 각각 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소화 한다.

// 아래코드는 간단한 문자열 데이터를 만들고, 해당 데이터를 반환하는 메서드 getReport()를 작성하는 코드다.
public class MakeReport {
    
 // StringBuffer 멤버 변수를 이용하여, 문자열을 생성할 수 있는 객체를 생성한다.
    // StringBuffer는 문자열을 조작하는데 유용한 클래스이다.
    // buffer 변수는 이후 append() 메서드를 통해 문자열 데이터를 추가할 때 사용된다.
    // append()메서드란? StringBuffer나 StringBuilder 객체에 문자열을 추가하는 기능이다.
    // 기존의 문자열 끝에 새로운 문자열을 추가하기 때문에, 문자열을 이어붙일 때 유용하게 사용된다.
    StringBuffer buffer = new StringBuffer();

    // line 변수에 문자열 데이터 사용 : 해당 문자열은 구분선으로 사용함.
    private String line = "===========================================\n";
    // title 변수에 문자열 데이터 사용 : 해당 문자열은 표의 제목으로 사용함.
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    // makeHeader()메서드는 문자열 데이터를 생성하는 역할을 한다. buffer 객체를 이용하여
    // 문자열 데이터를 생성한다. makeHeader() 메서드 내에서는 buffer 변수에 
    // 구분선(line), 제목(title), 구분선(line)순으로 문자열 데이터를 추가한다.
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    // generateBody() 메서드는 문자열 데이터를 생성하는 역할을 한다. buffer 객체를 이용하여
    // 문자열 데이터를 생성한다. generateBody() 메서드 내에서는 buffer 변수에 이름, 주소, 전화번호
    // 를 추가한 문자열 데이터를 순서로 추가한다.
    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333 \n");

        buffer.append("Tomas \t");
        buffer.append("Newyork USA \t");
        buffer.append("010-4444-5555 \n");
    }

    // makeFooter() 메서드는 무낮열 데이터를 생성하는 역할을 한다. buffer 객체를 이용하여 
    // 문자열 데이터를 생성한다. makeFooter() 메서드 내에서는 buffer 변수에 구분선 (line) 문자열 
    // 데이터를 추가한다.
    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}
