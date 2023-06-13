package ex06;

// 추상클래스 문법
/*
    new 동물();
   1. 추상클래스는 new가 안됨 = 인스턴스가 될 수 없다
   2. 추상클래스는 일반메서드와 추상메서드를 가질 수 있다.
   3. 추상클래스는 상태변수를 가질 수 있다.
 */
abstract class 동물 {
    String name;

    public abstract String getName();

    public void run() {
        System.out.println("달린다");
    } // 공통적인 거 명시

    public abstract void speak();
    // 추상 클래스가 추상메서드를 가진다는 의미는
    // 구체적인 행위를 알 수 없을 때
    // 구체적인 행위를 내가 정의해라
    // abstract는 강제성을 가짐

}

class 사자 extends 동물 {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("어흥");
    }
    // speak() 에 대해 강제성을 가짐
    // 구현을 해야 하니까
}

class 호랑이 extends 동물 {
    String color;

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("어흥");
    }
}

public class Abstract01 {
    public static void main(String[] args) {
        동물 d1 = new 호랑이();
        d1.name = "호랑이";
        사자 d2 = new 사자();
        호랑이 d3 = new 호랑이();
        d1.name = "사자";
        d3.color = "블랙";
        // d1.color = "블랙";
    }
}
