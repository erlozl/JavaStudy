package tra;
// 콘솔에서 입력받기 예제
import java.util.Scanner;
// Scanner 클래스는 java.util 패키지에 있다
public class Tra01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                // System.in은 키보드에서 바이트를 읽어서 우리에게 전달
        String name;
        int age;

        System.out.println("이름을 입력하세요");
        name = sc.next(); // next() 문자열을 읽는다 
        System.out.println("나이를 입력하세요");
        age = sc.nextInt(); // nextInt() 정수를 읽는다
        // nextDouble() 부동소수점을 읽는다.
        // nextLine() 한 줄의 문자열이 반환된다.

        System.out.println(name + age);

    }
}
