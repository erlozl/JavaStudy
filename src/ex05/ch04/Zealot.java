package ex05.ch04;

public class Zealot extends ProtossUnit {
    public Zealot(String name, int hp, int attack) {
        super(name, hp, attack); // ProtossUnit을 의미
        // super() 오류 - 안에 매개변수 안 넣어줘서
        // 부모의 생성자 호출하는 것임

        // super.attack
        // super.hp
        // super.name
        // 접근이 가능

    }
}
