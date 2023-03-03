package fastcam_java.chapter1.ch15;

public class IfElseIfElseTest {
    public static void main(String[] args) {
        // 조건이 여러 개 일때의 if문
        // 일명 if-else if-else문 
        // 하나의 상황에 대한 조건이 여러개로 나뉘고 각 조건에 다른 수행이 이뤄져야할 경우 사용
        // 각 조건은 상호 베타적임.

        // if(조건식1) {
        // 수행문1;  // 조건식1이 '참'인 경우 수행하고 전체 조건문을 빠져나감.
        // } 
        // else if(조건식 2) {
        //  수행문2; // 조건식2가 '참'인 경우 수행하고 전체 조건문을 빠져나감.
        // }
        // else if(조건식 3) {
        // 수행문3; // 조건식3이 '참'인 경우 수행하고 전체 조건문을 빠져나감.
        // }
        // else {
        // 수행문4; // 위 조건이 모두 해당되지 않는 경우 수행됨 (디폴트조건)
        // }

        // 수행문5; // if-else if-else 문이 끝나면 수행됨.

        // 가령 조건식2가 만족되면 수행문2 -> 수행문5 순으로 수행됨.
        // 실제 코딩을 한번 해 봅시다. 하나만 조건 충족되면 나머지 수행문 수행안하고 바로 결과 도출

        int age = 12; // 변수 age에 12할당
        int charge; // 입장료를 저장할 변수  charge선언

        if (age < 8) { // 수행문1
            charge = 1000; 
            System.out.println("미취학 아동입니다.");
        }
        else if (age < 14) { // 수행문2
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if (age < 20) { // 수행문3
            charge = 2500;
            System.out.println("중고생 입니다.");
        }
        else { //디폴트 조건
            charge = 3000;
            System.out.println("성인 입니다.");

        }
        System.out.println("입장료는 " + charge + "원입니다.");
        //  if-if문은 조건이 중첩될수도 있어서 하나의 결과만 도출하려면 if-else if문을 써야됨.
            



    } 
}
