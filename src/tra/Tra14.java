package tra;

// for문 미니 트리 만들기
public class Tra14 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            for (int a = 2; a > 0; a = a - 1) {
                System.out.print("a");
            }
            for (int b = 0; b < 3; b = b + 2) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
