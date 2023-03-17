package fastcam_java.chapter2.ch16;
// 여러 인스턴스에서 공통으로 사용하는 변수를 선언하자 - static 변수
// 공통으로 사용하는 변수가 필요한 경우
// 1. 여러 인스턴스가 공유하는 기준 값이 필요한 경우
// 2. 학생마다 새로운 학번 생성
// 3. 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
// 4. 회사에 사원이 입사할 때 마다 새로운 사번이 필요한 경우

// 공통의 static 변수가 하나 있으면, 인스턴스A, 인스턴스B, 인스턴스C 모두가 사용할 수 있는것들.
// static 변수 선언과 사용하기 (인스턴스 생성과는 전혀 상관이 없다.)
// ex) static int serialNum;
// 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
// 클래스 변수, 정적변수라고도 함(vs 인스턴스 변수)
// 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조

public class Employee {
    // 정적 변수 serialNum을 선언하고 1000으로 초기화한다.
    // 클래스의 모든 인스턴스에서 공유 된다.
    public static int serialNum = 1000;

   
    private int employeeId;
    private String employeeName;
    private String department;

    
    public Employee() {
        // 생성자는 serialNum 변수를 증가시키고, 그 값을
        // 해당 인스턴스의 employeeId 변수에 할당함.
        // 따라서 Employee 클래스의 인스턴스를 생성할 때마다 serialNum은 1씩 증가하고,
        // 그 값은 해당 인스턴스의 employeedId에 할당된다.
        serialNum++;
        employeeId = serialNum;
    }

    /**
     * @return int return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return String return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return String return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

}
