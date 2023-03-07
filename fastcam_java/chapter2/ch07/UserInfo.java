package fastcam_java.chapter2.ch07;

// userInfo 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다.
public class UserInfo {
    // userInfo 클래스의 클래스의 속성(멤버변수) -> 아이디, 비번, 이름, 주소, 전화번호 5개
    public String userId;
    public String userPassword;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    // 아무런 매개변수가 없는 생성자로, 기본 생성자이다.
    public UserInfo(){}

    // 3개의 문자열 매개변수를 받아서, 각각 userId, userPassword, userName
    // 멤버 변수를 초기화 하는 역할을 한다. 이 생성자는 매개변수로 전달된 값으로
    // 멤버 변수를 초기화 하기 위해 this 키워드를 사용한다.
    public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}

    public String showUserInfo() {
        return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
    }
    // this에 대해 알고넘어가자
	// this는 자바에서 객체의 인스턴스를 참조하기 위한 예약어로, 인스턴스 변수와 
	// 지역 변수 이름이 같을 때 서로 구별하기 위해 사용된다. 즉, 인스턴스 변수와 
	// 지역 변수의 이름이 같은 경우, 'this'를 사용하여 인스턴스 변수임을 명시한다.
	// 이는 코드의 가독성을 높이고, 인스턴스 변수의 값을 명확하게 지정할 수 있도록 한다.

    public class Person {
        // 인스턴스 변수 name
        private String name;
        
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
