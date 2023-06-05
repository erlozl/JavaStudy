package exam2;

public class Walking {
    public static void main(String[] args) {
        /* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
        double result = calculateCalory(5000); // 우변의 값이 100.0 , return 된 값이 result에 들어감
        // 우변의 값이 14번으로 점프해서 계산을 하고 돌려줌!
        System.out.println(result);

        /* 3. 결과를 출력하시오. */
    }

    /* 2. 칼로리 계산 메소드를 정의하시오. */
    private static double calculateCalory(int walk) {
        return 0.02 * walk;

        // private static int calculateCalory(int walk) {
        // return (int) 0.02 * walk;
        // 0.02를 int로 캐스팅하면 정수로 바뀌기 때문에 0.0이 됨
        // main에서 출력하고 실행하면서 결과값 수시로 확인하기
        // (int)(0.02 * 5000) 연산을!!!! 하고 나서 캐스팅(형변환)을 해야 함
    }
}
