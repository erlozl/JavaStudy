package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
        // 최대한 작은 값에 계산하기 쉬운 걸로 계산해보기
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        double pay = 0.0;
        if (basePay < 8.0) {
            System.out.println("최저 시급 에러");
            return;
            // voide가 있을 때 return을 하면 메서드의 종료
            // 돌려주는 데이터가 없음 (필터링이 됨0)
        }
        if (hours > 60) {
            System.out.println("초과 근무 시간 에러");
            return;
        }

        pay = basePay * hours; // 10, 41

        if (hours > 40) {
            pay = pay + (1 - 40) * (basePay * 0.5);
        }

        /* 해당 메소드를 완성하세요. */
        System.out.printf("$ %.2f\n", pay);
    }
}
