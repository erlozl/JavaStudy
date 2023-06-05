package tra;

import java.util.Scanner;

// if문 (성적처리)
public class Tra05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.println("학점을 입력해주세요");
        score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score < 90 && score > 80) {
            System.out.println("B학점");
        } else if (score < 80 && score > 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }
    }
}
