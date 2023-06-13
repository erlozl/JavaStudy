package ex05.ch03;

// 버스는 자동차의 한 종류다
// 버스를 일반화 시키면 자동차
// 자동차를 확장하면 버스
class Car1 {
    void run() {
        System.out.println("전륜 구동으로 달린다");
    }

    void best() {
        System.out.println("Car 보통 차다");
    }
}

class Bus1 extends Car1 {
    void sound() {
        System.out.println("안내방송");
    }

    void run() {
        System.out.println("후륜 구동으로 달린다");
    }

    void speak() {
        System.out.println("나는 버스다");
    }
}

public class Exten06 {
    public static void main(String[] args) {
        Bus1 b1 = new Bus1();
        b1.run();
        b1.sound();
        Car1 c1 = new Bus1();
        b1.speak();
        // Bus가 가지고 있는 추가적인 메소드를 사용하려면?
        Bus1 c2 = (Bus1) c1;
        // => c1이 참조하는 bus인스턴스를
        // 원래의 버스 형태로 참조해서 사용하겠다는 의미

        // c2 변수가 실제로 Bus1 객체를 참조하더라도,
        // best() 메서드는 부모 클래스에서 상속된 메서드이므로 부모 클래스의 메서드가 호출
        // 상속 관계에서 자식 클래스는 부모 클래스의 모든 멤버(필드, 메서드)를 상속받을 수 있으니까
        c2.best();
        c2.sound();

    }
}