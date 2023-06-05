package ex04;

// 칼로리 소모량 계산하기
public class Walking {

    private static double calculateCalory(int walk) {
        return 0.02 * walk;
    }

    public static void main(String[] args) {
        // 칼로리 계산을 위해 메소드를 호출하시오
        double result = calculateCalory(5000);
        System.out.println(result + "kcal");
        // 결과를 출력하시오
    }
}
