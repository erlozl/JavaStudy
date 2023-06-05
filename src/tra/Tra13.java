package tra;

public class Tra13 {

    public static void main(String[] args) {

        int[] num = { 10, 50, 30 };
        int max = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num.length);
            if (max < num[i])
                max = num[i];
        }

        System.out.printf("가장 큰 수는 %d입니다.", max);
    }
}
