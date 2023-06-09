package ex05.ch02;

public class Dragoon extends ProtossUnit {
    String name;
    int hp;
    int attack;

    public Dragoon(String name, int hp, int attack) {
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
