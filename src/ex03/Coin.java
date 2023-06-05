package ex03;

import java.util.Scanner;

// for문과 배열로 간결하게 프로그래밍하기
public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 입력하세요");
        final int money = sc.nextInt();
        int restMoney = money;
        int count;

        int[] tempMoneys = { 500, 100, 50, 10 };

        // 또 다른 방식 (확장 for문)
        // for([배열 자료형][변수명]:[배열명] or [컬렉션 객체명]){
        // // 변수는 배열 내의 각각의 값을 뜻함
        // }
        for (int m : tempMoneys) {
            // 배열일때 사용하면 편함
            count = restMoney / m;
            System.out.println(m + "원 " + count + "개");
            restMoney = restMoney % m;
        }

        // for (int i = 0; i < tempMoneys.length; i++) {
        // count = restMoney / tempMoneys[i];
        // restMoney = restMoney % tempMoneys[i];
        // System.out.println(tempMoneys[i] + "원 " + count + "개");
        // }

    }
}
