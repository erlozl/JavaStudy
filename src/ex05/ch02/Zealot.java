package ex05.ch02;

public class Zealot extends ProtossUnit {
    String name;
    int hp;
    int attack;
    // 숫자는 값을 안 넣으면 0으로 초기화
    // 문자열은 null로 초기화

    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    int getAttack() {
        return attack;
    }

    @Override
    int getHp() {
        return hp;
    }

    @Override
    int setHp(int hp) {
        return this.hp = hp;
    }

    @Override
    String getName() {
        return name;
    }

}
