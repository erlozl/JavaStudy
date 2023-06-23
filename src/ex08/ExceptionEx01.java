package ex08;

// 인덱스가 배열의 크기를 벗어나는 경우에 발생되는 예외처리
public class ExceptionEx01 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // 배열의 인덱스는 0부터 시작하므로
        // 배열의 길이보다 큰 인덱스인 5는 유효하지 않다.
        int i = 0;
        try {
            for (i = 0; i <= array.length; i++) {
                System.out.println(array[i] + "");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스" + i + "는 사용할 수 없네요");
        }
    }
}
