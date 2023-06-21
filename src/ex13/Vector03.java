package ex13;

import java.util.Vector;

// 몬스터
class Monster {
    String name;
    double hp;

    Monster(String name, double hp) {
        this.name = name;
        this.hp = hp;
    }

    // 부모 타입 object = 접근제어자 동일하게 맞추기
    public String toString() {
        return "name = " + name + "hp = " + hp;
        // return "{" + name + "," + hp + "}";
    }

}

public class Vector03 {
    public static void main(String[] args) {
        Vector<Monster> mon = new Vector<>();
        // 벡터 타입에 Moster 객체 생성
        mon.add(new Monster("Mon1", 100.0));
        mon.add(new Monster("Mon1", 100.0));
        mon.add(new Monster("Mon1", 100.0));

        System.out.println(mon);

    }
}
