package tra;

// for 문 팩토리얼값 출력하기
import java.util.Scanner;

public class Tra09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("num의 값을 입력해주세요");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
