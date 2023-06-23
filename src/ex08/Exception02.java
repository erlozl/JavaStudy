package ex08;

// numberFormat 예외처리
public class Exception02 {
    public static void main(String[] args) {
        // 문자열 "ABC"를 정수로 변환하는 작업을 하는데
        // 올바르게 변환될 수 있는 숫자형식이 아니기 때문에 예외 발생
        try {
            int num = Integer.parseInt("ABC");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat 예외 발생");
        }

    }
}
