package ex13;

// IDE 통합개발환경
class Box2 {
    Object value;
    // 이는 다형성(polymorphism) 개념
    // Object 타입의 변수는 어떤 객체의 타입이든 알 수 없으며,
    // 모든 객체의 공통적인 특성과 동작에 대한 참조를 가지고 있다.
}

class AppleFruit {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class bananaFruit {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Basic01 {
    public static void main(String[] args) {
        Box2 box = new Box2();
        box.value = new AppleFruit();

    }
}
