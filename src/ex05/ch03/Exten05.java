package ex05.ch03;

// 버스는 자동차의 한 종류다
// 버스를 일반화 시키면 자동차
// 자동차를 확장하면 버스
class Car {
    void run() {
        System.out.println("전륜 구동으로 달린다");
    }

    void best() {
        System.out.println("Car 보통 차다");
    }
}

class Bus extends Car {
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

class SuperCar extends Car {
    void run() {
        System.out.println("사륜 구동으로 달린다");
    }

    void best() {
        System.out.println("좋은 차다");
    }
}

class TwoBus extends Bus {
    void tworun() {
        System.out.println("이층버스가 열심히 달린다");
    }

    void speak() {
        System.out.println("나는 2층버스다");
    }
}

public class Exten05 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
        b1.sound();
        Car c1 = new Bus();
        Bus tb = new TwoBus();
        b1.speak();
        tb.speak();
        // Bus가 가지고 있는 추가적인 메소드를 사용하려면?
        Bus c2 = (Bus) c1;
        // => c1이 참조하는 bus인스턴스를
        // 원래의 버스 형태로 참조해서 사용하겠다는 의미
        c2.best();
        Car s1 = new SuperCar();
        Car d1 = new Car();
        // 버스는 자동차다
        c1.run();
        s1.run();
        d1.best();
        s1.best();
        // 타입이 가지고 있는 메소드만 사용 가능

    }
}