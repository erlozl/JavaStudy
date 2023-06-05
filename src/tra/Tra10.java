package tra;

// for문 약수 계산하기
public class Tra10 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("100의 약수" + i);
            }
        }
    }
}
