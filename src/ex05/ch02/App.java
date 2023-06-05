package ex05.ch02;

// 동적바인딩 메서드 찾기
public class App {
    static void attack(ProtossUnit ul, ProtossUnit u2) {

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit d2 = new Dragoon("드라군2", 100, 5);
        attack(z1, z2);
        attack(d1, z2);
    }
}
