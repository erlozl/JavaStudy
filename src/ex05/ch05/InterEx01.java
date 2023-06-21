package ex05.ch05;

/**
 * 인터페이스
 * 1. 필요한 메서드만 노출시키고 싶을 때!
 * 프로그램 설계할 때, 특정 메서드만 사용하도록 강제시키고 싶을 때
 */
// 외부에 노출시킬 표를 만들어야 함
// interface 뒤에 able이라는 단어를 붙임 "~를 할 수 있는 방법"
// 인터페이스도 추상메서드를 가질 수 있음
// 쉬운 UX는 인터페이스에서 생각함 (이런 UX가 있으면 좋겠네?)
// 인터페이스는 extends 안됨
// 인터페이스 new 안됨 - 객체가 아니기 때문에

// CarAble의 구현체는 Car이다
interface CarAble {
    // public 쓴 이유 - 사용자한테 노출시킬려고
    public abstract void 엑셀(); // 노출시키고 싶은 것들을 위에 적어놓음 (사용자가 이걸 클릭하면 편하게 사용하라고)
    // 이 메서드가 노출되어있다는 뜻
    // 인터페이스 안에서 선언되는 메소드들은 모두 묵시적으로 public abstract이다 - 없어도 됨
}

// 이 Car에 New를 해줘야 함
// 여기서 implements는 구현하다는 뜻 - 인터페이스에 정의된 추상 메소드의 몸체를 정의한다는 뜻
class Car implements CarAble {
    // public void 엑셀() {
    // 엔진가열();
    // 모터작동();
    // 바퀴회전();
    // }

    // private로 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 함
    private void 엔진가열() {
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");
    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }

    // 이게 없으면 오류 (구현을 안했기 때문에)
    @Override
    // CarAble의 정의된 메소드 오버라이드시켜서 공통적으로 사용할 수 있는 메서드 오버라이딩
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        // 구현체를 통해 사용하는 것이 일반적
        // 상속을 따지면 자식클래스를 사용하는 게 낫다

        // 다형성이랑 상관없는데 되는 이유 (인터페이스에서 예외)
        // 행위를 제한시키려고 인터페이스에서 사용하는 문법
        CarAble carAble = new Car();
        Car car = new Car();
        // Car car2 = new CarAble();
        // CarAble car = new CarAble();
        car.엑셀();
        System.out.println();
        carAble.엑셀();
    }
}
