package exam2;

public class Elevator {
    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 25;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    /* 메소드를 완성하시오. */
    public static String guide(int floor) {
        // 1. 유효성검사 (필터)
        if (floor > 20 || floor < 1)
            return "오류"; // 애초에 잘못된 값을 초기에 바로 처리해버리자

        // 2. return을 하는 메서드이면 리턴값 초기화
        String result = "";
        // 3. 알고리즘
        if (floor >= 1 && floor <= 10) {
            result = "저층";
            // return이 오면 메서드 자체가 종료됨
            // return 밑에 실행코드 오면 오류
        } else if (floor >= 11 && floor <= 20) {
            result = "고층";
        }
        // 4. 리턴하기
        return result;
    }
}
