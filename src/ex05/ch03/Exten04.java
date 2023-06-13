package ex05.ch03;

// 공통 모듈을 만들고 싶다 - 메서드 하나
// Animal에서 speak메서드는 통로 역할 = 인터페이스 역할
// 구체적인 걸 만들고 추상화 시키는 것

// abstract클래스 - 추상화 ㅡ> new 안됨(구체적인 게 안되기 때문에)
// 추상메서드는 추상클래스에만 사용할 수 있음
abstract class Animal {
    abstract void speak(); // 오버라이드
    // <ㅡ 추상메서드로 만들기 (구체적 행위가 없기 때문에 )
    // 통로 역할
}

// 추상메서드를 만들면 오류가 난다
// 추상메서드 블록이 없으면 무조건 재정의해야된다는 뜻
class Dog extends Animal {
    // 1. 상태
    // String name;
    // String color;

    // 2. 행위
    void speak() {
        System.out.println("멍멍");
    }
}

// 구체적인 메서드는 구현을 해야함
class Bird extends Animal {
    // 여기서 뜨는 오버라이드는 재정의하는 거임
    // 부모 메서드는 오버라이드 됐음
    void speak() {
        System.out.println("짹짹");
    }
}

class Cat extends Animal {
    // String name;
    // String color;

    void speak() {
        System.out.println("야옹");
    }
}

public class Exten04 {
    // 게임을 시작하는 메서드
    static void start(Animal u) {
        u.speak();
    }

    // 내부를 변경할 필요없고 타입만 변경 < 오버로딩

    public static void main(String[] args) {
        // Animal d = new Animal(); < cannot instantiate the type animal 오류 (직접적으로 객체를
        // 생성할 수 없는 타입)>
        Animal d = new Dog();
        start(d);
        // 이 힙에 레퍼런스 변수를 넘겼다
        // 애니멀 타입을 강아지에 넣는 격
        Animal c = new Cat();
        start(c);
        Animal b = new Bird();
        start(b);

        // Cat cc= Animal;
        // 동물을 고양이에 넣는다는 건 안됨 / 동물이 고양이니?
        // Animal a = cat;
        // 고양이를 동물에 넣는다는 됨 / 고양이가 동물이니?
        // 오른쪽을 왼쪽으로 대입
        // 부모를 자식에 넣을 수 없다 - 문법
    }

    // 부모 <= 자식
    // (동물) <= (강아지)

}
