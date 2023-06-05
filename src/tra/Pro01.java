package tra;

import java.util.Scanner;
public class Pro01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("번호를 선택하시오");
        int num = sc.nextInt();
        System.out.println("화씨 온도를 입력하시오 :");
        double f_tempValue = sc.nextDouble();
        
        double c_temp = (double)5/9 * (f_tempValue-32);
        System.out.println("섭씨 온도는 " + c_temp);

        System.out.println("섭씨 온도를 입력하시오 : ");
        double c_tempValue = sc.nextDouble();

        double f_temp = (c_tempValue * (double)9/5) + 32;
        System.out.println("화씨 온도는 " + f_temp);

        String totalValue = (c_temp < f_temp) ? "화씨온도" : "섭씨온도"; 
        System.out.println(totalValue);

    }
}
