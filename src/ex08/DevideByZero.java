package ex08;

// try {
//     예외가 발생할 수 있는 코드
// } catch (예외 클래스 변수) {
//     예외를 처리하는 코드
// }
// finally {
//     여기 있는 코드는 try 코드 블록이 끝나면 무조건 실행된다.
// } ㅡ> 생략 가능

// 예외처리예제 1번째유형
public class DevideByZero {
    static void devide(int n) {
        int result = 10 / n;
        System.out.printf("나눗셈 결과 : %s", result);
    }

    public static void main(String[] args) {
        try {
            devide(0);
        } catch (ArithmeticException e) {
            // Exception 최상위부모
            System.out.println("나눌 수 없음 : " + 0);
            System.out.println(e.getMessage());
        }
        // System.out.println("나눗셈 결과 : " + result);
    }
}
