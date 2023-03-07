package fastcam_java.chapter2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {
         // userLee라는 인스턴스 생성
    UserInfo userLee = new UserInfo();
    // userLee의 인스턴스 변수에 각각 값을 할당한다.
    // 객체를 생성한 후에, 객체의 각 인스턴스에 변수 값을 할당하는 방식
    // 즉, 객체를 생성한 후에, 객체의 각 인스턴스 변수를 따로 따로 초기화 해야하는 귀찮으.ㅁ
    userLee.userId = "a12345";
    userLee.userPassword = "zxcvbn12345";
    userLee.userName = "Lee";
    userLee.phoneNumber = "01094051987";
    userLee.userAddress = "Seoul, Korea";

    System.out.println(userLee.showUserInfo());

    //userKim이라는 인스턴스 생성
    // 인스턴스 생성과 동시에 매개변수에 값을 넣어주면서 변수를 초기화 해서 간편하고 편리함.
    UserInfo userKim = new UserInfo("b12345", "0987mnbvc", "Kim");
    //출력한다.
    System.out.println(userKim.showUserInfo());
    }
}
