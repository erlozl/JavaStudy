package tra;

// if 짝수 홀수
import java.util.Scanner;

public class Tra07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("숫자를 입력하세요");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
    }
}
