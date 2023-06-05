package ex02;

import java.util.Scanner;
public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 자바에서 만든 라이브러리
        // System.out < 모니터 / System.in < 키보드 
        
        int x, y, sum;

        System.out.println("첫번째 입력");
        x = sc.nextInt(); // 코드가 멈춤(가만히 놔두면 데몬,값이 들어왔는지 계속 돌고 있음)

        System.out.println("두번째 입력");
        y = sc.nextInt(); // 코드가 멈춤(가만히 놔두면 데몬,값이 들어왔는지 계속 돌고 있음)

        sum = x + y;
        System.out.println("x+y의 합은 " + sum);
    }
}
