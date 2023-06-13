package ex06;

/*
 * 1. 인터페이스는 new 할 수 없다.
 * 2. 인터페이스는 static 변수를 만들 수 있다.
 * 3. 인터페이스는 추상메서드만 가진다
 * 
 * 구현체 - 몸통 만드는 것
 * 
 * 인터페이스의 용도
 * 1. ( 노출 ) - 매개체 역할 
 * 외부에 노출시켜야 하기 때문에 무조건 public
 * 2. Able이라고 적혀있으면 인터페이스 (강제성)
 */
// 인터페이스는 대문자로
interface Remote {
    int NUM = 10; // public static final 생략

    void run(); // public abstract 생략되어있음
}

public class Interface01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);

    }
}
