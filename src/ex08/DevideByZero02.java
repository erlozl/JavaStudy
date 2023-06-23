package ex08;

// 예외처리예제 2번째유형
public class DevideByZero02 {
    static void devide(int n) {
        try {
            int result = 10 / n;
            System.out.printf("나눗셈 결과 : %s", result);

        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }

    public static void main(String[] args) {
        devide(0);

    }
}
