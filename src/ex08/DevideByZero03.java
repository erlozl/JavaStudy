package ex08;

// 예외처리예제 1번째유형
public class DevideByZero03 {
    // 0으로 나누면 분명 오류가 나는데, 그 제어는 사용자에게 맡기고 싶다.

    // 계속 미룸

    // 보통은 만들어놓는 게 나음 throws Exceptiron
    static void devide(int n) throws Exception {
        int result = 10 / n;
        System.out.printf("나눗셈 결과 : %s", result);
    }

    public static void main(String[] args) {
        try {
            devide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " : 0으로 나눌 수 없습니다");
        }
        // System.out.println("나눗셈 결과 : " + result);
    }
}
