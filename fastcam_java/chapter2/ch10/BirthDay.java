package fastcam_java.chapter2.ch10;
// get(),set() 메서드에 대해 알아보자.
// private으로 선언된 멤버 변수(필드)에 접근, 수정할 수 있는 메서드를 public으로 제공
// get()메서드만 제공되는경우 read-only 필드

public class BirthDay {
    // 우선 private으로 선언해 외부에서 접근하지 못하게 변수를 선언한다.
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    // 각 필드에 getter와 setter 메서드를 구현한다.
    // getter 메서드는 각 필드의 값을 반환하며, setter 메서드는 각 필드의 값을 설정하는 역할을 한다.
    // 이렇게 클래스에 getter와 setter 메서드를 구현함으로써, 객체의 필드 값을 캡슐화 하고,
    // 캡슐화된 필드에 접근하는 메서드를 통해 객체의 상태를 안전하게 유지할 수 있다.

    // get(),set() 메서드는 객체의 필드에 접근하기 위해 사용되는 메서드이다.
    // get()메서드는 객체의 필드 값을 가져오는 메서드다. 이 메서드는 보통 get 다음에 
    // 필드의 이름을 붙여서 작명된다. 예를들어 하단의 day가 필드의 이름이라면 getDay()로 작명한다.

    // set()메서드는 객체의 필드값을 변경하기 위해 사용되는 메서드다. 이 메서드는 보통 "set" 다음에 
    // 필드의 이름을 붙여 작명된다. 필드값이 day라면 setDay()로 작명한다.

    // 이처럼 Java에서는 일반적으로 필드에 직접 접근하는것을 권장하지 않고, get(),set()을 통해
    // 간접적으로 필드에 접근하도록 권장한다. 이렇게 함으로써 객체의 필드 값이 무결성을 유지하며,
    // 객체 내부의 상태가 의도치 않게 변경되지 않도록 보호할 수 있다.


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    // setMonth 메서드를 수정하여, 입력받은 월의 값이 1~12 사이의 유효한 값인 경우에만
    // 멤버 변수인 month에 할당하고, 그 이외의 경우에는 isValid변수에 false값만 설정하도록 함.
    public void setMonth(int month) {
        if( month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // 유효한 날짜인 경우 해당 날짜를 출력하고, 그렇지 않은 경우는 "유효하지 않은 날짜입니다."
    // 라는 메시지를 출력하도록 설정
    public void showDate() {
        if(isValid) {
            System.out.println(year + " 년" + month + "월 " + day + "일 입니다. ");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }

}
