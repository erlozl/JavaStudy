package exam2;

public class ExamTest {
    public static void main(String[] args) {
        System.out.println(0.02 * 5000);
        // 이런식으로 main에다가 출력 먼저 해보기
        double result = 182.736 / 8.86;
        System.out.printf("%.2f", result);
        System.out.println();
        double result2 = Math.random() * 6;
        // 0.1 * 6, 0.2 * 6, 0.9 * 6 - 0.9가 maxValue이므로 + 1을 해줘야 함
        // 샘플링은 낮은 숫자로 출력해보기
        System.out.println(result2);
    }
}
