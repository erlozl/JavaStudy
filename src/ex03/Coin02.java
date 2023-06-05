package ex03;

import java.util.Scanner;

// 메서드로 간결하게 프로그래밍하기
public class Coin02 {
    // class 밖에 메서드 두면 안됨, class 밖에 class는 둘 수 있음, 메서드 안에 메서드 안됨 - 이건 문법
    // main 안에는 메서드를 못 넣음

    // 메서드는 99.9% 모듈화된 걸 사용
    // static 안에는 heap 변수를 넣을 수 없다

    final int money = 120005160;
    int restMoney = money;
    int count;

    void printRestMoney(int m) { // 행위 (printRestMoney스택) - 메서드 이름 지을 때 앞에는 무조건 동사, 파스칼 표기법X
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) { // main스택
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요");
        Coin02 c2 = new Coin02();
        c2.printRestMoney(500);
        c2.printRestMoney(100);
        c2.printRestMoney(50);
        c2.printRestMoney(10);

    }
}
