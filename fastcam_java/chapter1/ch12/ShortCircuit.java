package fastcam_java.chapter1.ch12;

public class ShortCircuit {
    public static void main(String[] args) {
        // 논리 곱 (&&, AND)은 두 항의 결과가 모두 true일때만 결과가 true
        // -> 앞의 항이 결과가 false이면 뒤 항의 결과를 평가하지 않음 -> 어차피 false니까
        // -> 앞이 false면 뒤를 볼 필요도 없으니, 앞 뒤 둘다 true를 요함. 

        // 논리 합 (||, OR)은 두 항의 결과가 모두 false일 때만 결과가 false
        // -> 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음.
        // -> 둘 중 하나만 ture이면 되기 때문에, 앞이 true가 나오면 뒤를 볼 필요가 읍다.

        int num1 = 10; // 정수형 num1에 10을 대입
        int i = 2; // 정수형 i에 2를 대입

        // num1은 10인데 + 10을 하면 20.. 근데 10보다 작다? false
        // AND i는 2인데, +2를 하면 4다. 10보다 작은거 맞다 -> true
        // AND는 두 조건 다 ture가 나와야함. 전자가 틀렸으니 답은 -> false
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value); // -> false 
        System.out.println(num1); // -> 20
        // 4가 나와야 하는데 2가 나온다
        // why? 앞 항이 false기 때문에 계산할 필요도 없어서 안한거임.
        System.out.println(i); // -> 2

        // ||(OR)의 경우는 앞에 false가 나와도 뒤에 true가 나오면 ture기 때문에 끝까지 봐야함.
        // num1은 10인데 +10을 더하면  20.. 근데 10보다 작다? false -> 그래도 뒤를 보자 
        // i는 2인데 +2를 하면 4가나 나옴 -> 10보다 작다? true -> 그러므로 결과는 true

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println(value); // OR이기 때문에 후자하나만 맞아서 결국 true가 됨
        System.out.println(num1); // num1 num + 10 = 20
        System.out.println(i); // i + 2 = 4


    }
}
