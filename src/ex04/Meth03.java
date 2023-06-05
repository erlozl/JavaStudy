package ex04;

class Account {
    // 입금 (입금할 금액, 계좌 잔액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        // 총금액을 저장할 변수값
        return restMoney; // 메서드를 호출한 라인으로 복귀하는 쪽으로(복귀 주소로) 값 반환
    }

    // 출금 (입금할 금액 300, 계좌 잔액 => money)
    int widthdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

    // 이체 (보낼 금액(amount), 받는 사람 잔액(receiverMoney), 보내는 사람 잔액(senderMoney))
    // 2000, 3000 5000
    void transfer(int amount, int receiverMoney, int senderMoney) { // 리턴X, 출력만

        // 출력 : 받는사람잔액 출력
        // 출력 : 보낸사람잔액 출력
        // 리턴할거면 배열로?
    }

}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000; // 최초 금액 정해주기 (최초에 1000원이 있음)
        // 최초 금액 설정해주는 이유 -> 계좌 잔액은 계속 바뀌기 때문에

        Account hAccount = new Account();
        // Account 클래스의 타입은 Account 타입 , heap이라는 공간에 띄울건데 그것이 new 문법을 사용
        // heap에 뜨는 것 메서드의 이름만 뜬다 (이름을 찾아감)
        // deposit 메서드를 호출할 때 deposit 매개변수 스택이 뜸

        // 홍길동이 입금을 2번하고, 출금을 1번하기
        hMoney = hAccount.deposit(100, hMoney); // 입금이라는 행위를 하고 있음
        // 위 코드를 return을 하면 이 코드 자체가 1100원으로 바뀜, 그래서 money변수를 지정해주면 결과값을 받을 수 있음
        System.out.println("홍길동 남은 금액 : " + hMoney);
        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("홍길동 남은 금액 : " + hMoney);
        hMoney = hAccount.widthdraw(300, hMoney);
        System.out.println("홍길동 남은 금액 : " + hMoney);

        System.out.println();

        // 임꺽정의 잔액
        int iMoney = 1000;
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);
        iMoney = iAccount.widthdraw(300, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);
        iMoney = iAccount.widthdraw(500, iMoney);
        System.out.println("임꺽정 남은 금액 : " + iMoney);

        // 임꺽정이 입금을 1번(100원)하고, 출금 2번(300,500)하기

        // static은 한번만 띄우고 싶을 때
        // heap은 여러 개를 띄우고 싶을 때

        // ex) 자판기
        // 콜라 = (int) 메서드 이름과 타입은 어떤 그림을 보고 확인하라고 적어주는 것
        // 음료 나오는 곳 = return
        // 동전투입구, 카드(인수), 지폐투입구 = 매개변수(int amount,money);
        // 자판기가 없으면 자판기를 호출 - new
        // 자판기가 태초부터 있었다면 static이 있었으면 new를 안 붙여도 됨

        // new 문법을 쓴 각각의 객체를 인스턴스라고 함 (특정한 클래스로부터 생성된 객체)
        // ex) 자동차가 class라면 객체는 차의 종류인 BMW, Audi, Mercedes 라고 함

    }
}
