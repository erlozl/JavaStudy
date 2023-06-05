package tra;

import java.util.Scanner;
public class mini01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orange;

        System.out.println("오렌지의 갯수를 입력하세요");
        orange = sc.nextInt();
        int count = orange / 10;
        int remain = orange % 10;
        System.out.println(count + "박스가 필요하고" + remain + "개가 남습니다");

        System.out.println("마일을 입력하시오 :");
        double mileValue = sc.nextDouble();
        double mile = 1.609;
        double km = mileValue * mile;
        System.out.println(mileValue + "의 값은" + km + "킬로미터 입니다");

        int x;
        int y;
        System.out.println("x와 y의 값을 하나씩 입력해라");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println((x + y)/2);
        System.out.println((x > y) ? "큰 수 : 20" : "작은 수 : 10");
        System.out.println((x < y) ? "큰 수 : 20" : "작은 수 : 10");

        System.out.println("시간 간격을 입력하시오");
        int totalDis = sc.nextInt();
        int sound = 340;
        int light = 300000;

        int total = (light / sound) * 7;
        System.out.println(total);

    }
}
