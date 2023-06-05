package tra;
//alt + shift + o (안 쓰는거 삭제해줌)

// java.lang (자바 패키지)
//import를 안해도 되는 라이브러리 = 내장 라이브러리 

// if문 가위바위보
import java.util.Scanner;

public class Tra06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("바위는 1, 보는 2, 가위는 0을 입력하세요");
        // int user = sc.nextInt();
        // int computer = (int) (Math.random() * 3);

        // if (user == computer && (user < 3 || user <= 0)) {
        // System.out.println("무승부");
        // } else if (user > computer && (user < 3 || user <= 0)) {
        // System.out.println("이겼다");
        // } else if (user < computer && (user < 3 || user <= 0)) {
        // System.out.println("졌다");
        // } else {
        // System.out.println("다시 입력하세요");
        // }

        System.out.println("가위는(0), 바위(1), 보(2) : ");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        // Math.random(); // 랜덤한 값을 뽑아줌
        // 괄호 형태가 되어있는 것은 메서드(행위)

        // void는 리턴해줄 게 없다는 뜻 (자판기로 치면 동전을 먹겠다는 뜻,,)

        if (user == computer) {
            System.out.println("인간과 컴퓨터가 비겼음");
        } else if (user == (computer + 1) % 3) {
            System.out.println("인간:" + user + "컴퓨터" + computer + "인간승리");
        } else {
            System.out.println("인간:" + user + "컴퓨터" + computer + "컴퓨터 승리");
        }
    }
}
