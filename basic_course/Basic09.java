package basic_course;
// Static과 Single-tone Pattern에 대해 공부하자.
// 1. Static은 '정적인'이라는 뜻으로, 클래스에 인스턴스를 생성하지 않아도 접근이 가능합니다.
// 예를 들어, 카운터 프로그램을 만든다고 가정해보자. 이때 각 객체에서 카운터를 하나씩 증가
// 시키고싶을 때, static을 사용할 수 있다.
public class Basic09 {

    public class Counter {
        private static int count = 0; // 정적 변수

        public Counter() {
            count++; // 정적 변수를 1증가 시킴
            System.out.println(count + "번째 Counter가 생성 되었습니다.");
        }
    // 위 코드에서 'count'변수는 정적 변수로 선언되어 있다. 이 변수는 클래스를 로딩할 때
    // 생성되며, 인스턴스를 생성하지 않아도 클래스 내에서 언제든 접근 가능하다. 'Counter'
    // 클래스의 생성자에서는 'count' 변수를 1씩 증가시키고 이 값을 출력한다.
    }

    // 2. Single-tone Pattern

    // 인스턴스를 오직 하나만 생성하도록 보장하는 패턴이다. 어떤 클래스가 여러 곳에서
    // 인스턴스를 생성하게 되면, 자원의 낭비가 발생할 수 있다. 이를 방지하기 위해 
    // 싱글톤 패턴을 사용한다. 싱글톤 패턴은 생성자를 private으로 선언하고, 
    // 정적 메서드를 사용해 유일한 인스턴스에 접근할 수 있도록 한다.
    // 회사 정보를 저장하는 클래스 Company를 싱글톤 패턴으로 만들어보자.
    }

    // public class Company {

            // 유일한 인스턴스를 저장할 정적 필드 선언 
            // 유일한 인스턴스를 저장하는 instance 필드는 private으로 선언하여
            // 외부에서 접근하지 못하도록 함.
    //     private static Company instance = new Company();

           // 회사 이름을 저장할 필드 선언
    //     private String companyName;

           // 생성자를 private으로 선언하여 외부에서 인스턴스를 생성할 수 없도록 함.
    //     private Company() {
               // 회사 이름 초기화 
    //         this.companyName = "My Company";
    //     }
        // 유일한 인스턴스를 반환하는 getInstance() 
        //메서드는 public으로 선언하여 외부에서 호출할 수 있도록 함
        // 유일한 인스턴스를 반환하는 정적 메서드 선언
    //     public static Company getInstance() {
    //         return instance;
    //     }
           // 회사 이름을 반환하는 메서드 선언
    //     public String getCompanyName() {
    //         return companyName;
    //     }
    
    // }

    