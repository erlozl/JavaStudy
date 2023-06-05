package ex04;

// 매개변수
class Cal02 {
    void add(int n1, int n2) {
        // 매개변수 = 매개체 역할
        System.out.println("더하기 : " + (n1 + n2));
        // 메서드 종료시에 날라감
        // 지역변수(로컬변수) - 생명주기가 짧다

        // 호출할 때 매개변수가 2개 이기때문네 8byte

    } // 스택을 종료하고, 복귀주소(숫자)를 확인하고 복귀한다. (그냥 열리고 닫힘)

    // 보관할 수 있는 방법 -> return , heap에 보관

    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + (n1 * n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기 : " + (n1 / n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        // 타입이 Cal02라는 heap공간이 생김
        c1.add(10, 5);
        c1.add(8, 7);
        // argument 인수

        // 메서드를 호출한다는 건 점프한다는 거
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

        // 여기서 .은 객체 연결 연산자
    }
}
