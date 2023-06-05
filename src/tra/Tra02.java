package tra;
// 콘솔에서 입력받기 예제
import java.util.Scanner;

public class Tra02 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        int time;

        System.out.println("초를 입력하시오");
        time = sca.nextInt();
        int sec = time%60;
        int min = time/60;

        System.out.println(time + "은 " + min + "분 " + sec + "초이다");

        // int n1 = 310;
        // int n2 = 60;
        // int min = n1 / n2;
        // int sec = n1 % n2;
    }
}
