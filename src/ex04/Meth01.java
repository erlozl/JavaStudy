package ex04;

// 메서드와 변수는 오류
// 클래스의 위치는 최상위에 위치할 수 있다

// 이 코드는 객체 지향코드가 아님
class Cal01 {
    void add() { // 메서드의 기본형
        // void는 리턴하지 않겠다 , void가 없으면 자료형을 넣어줌
        System.out.println("add 호출됨");
    }

    void minus() {
        System.out.println("minus 호출됨");
    }

    void multi() {
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }
}

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();

        // 여기서 .은 객체 연결 연산자
    }
}
