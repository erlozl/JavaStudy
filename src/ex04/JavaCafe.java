package ex04;

public class JavaCafe {
    double basePay = 8.00;
    int hours = 40;

    public void printPay(double basePay, int hours) {
        double pay = basePay * hours;
        // 각각 일한 시간과 시급을 계산한 값을 pay에 넣어줌
        double miniPay = basePay * this.hours;
        // 원래의 최저시급을 계산한 값을 miniPay에 넣어줌
        double overPay = (hours - this.hours) * basePay * 1.5;
        // 초과된 시간만을 계산한 값을 overPay에 넣어줌

        if (this.hours == hours) {
            System.out.println(pay);
        } else if (this.hours < hours && hours < 60) {
            System.out.println(miniPay + overPay);
        } else if (this.hours > hours) {
            System.out.println("최저 시급 에러");
        } else if (this.hours < hours && hours > 60) {
            System.out.println("초과 근무시간 에러!");
        }

    }

    public static void main(String[] args) {
        JavaCafe cafe = new JavaCafe();

        cafe.printPay(10.00, 40);
        cafe.printPay(10.00, 50);
        cafe.printPay(7.50, 38);
        cafe.printPay(8.50, 66);
    }
}
