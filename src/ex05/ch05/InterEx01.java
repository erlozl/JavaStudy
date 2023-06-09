package ex05.ch05;

// API 문서 보는 게 중요
// API란 내가 만들 응용프로그램에서 사용 할 수 있도록 기타 다른 응용프로그램들을 제어 할 수 있게 하는 것을 말한다.
// 자판기에 비교를 하자면 Application Program은 자판기의 기능이고 API는 그 기능을 사용할 수 있는 버튼을 의미한다고 할 수 있습니다
// 해당 기능이 어떤 결과를 가져다주고 또 그 기능을 어떻게 쓸 수 있는지를 알 수 있는 부분이 API입니다. 
// API 문서는 이러한 사용법을 그 기능을 활용하려고 하는 개발자들에게 알려주는 역할을 합니다. 
// 그러니 자신이 만든 기능이 잘 활용되게 하고 싶다면 API를 잘 정의하는 것이 중요
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
}

// 이 Car에 New를 해줘야 함
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
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        // 다형성이랑 상관없는데 되는 이유 (인터페이스에서 예외)
        // 행위를 제한시키려고 인터페이스에서 사용하는 문법
        CarAble carAble = new Car();
        Car car = new Car();
        // CarAble car = new CarAble();
        car.엑셀();
        System.out.println();
        carAble.엑셀();
    }
}
