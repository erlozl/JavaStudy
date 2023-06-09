package ex05.ch02;

// 자바의 핵심 
// 동적바인딩 메서드 찾기
public class App {
    // 공격을 해야 하니 공격 메서드 만들기
    static void attack(ProtossUnit u1, ProtossUnit u2) {
        // 바뀌는 HP (기존 HP - 공격 ATTACK)
        // 공격받고 기존 HP가 깎여야하니까 식은 이렇게 만들어준다
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u1.getName() + "이 " + u2.getName() + "에게 공격당했습니다");
        System.out.println(u2.getName() + "의 남은 hp : " + u2.getHp());
    }

    public static void main(String[] args) {
        ProtossUnit zeal1 = new Zealot("질럿1", 100, 10);
        ProtossUnit zeal2 = new Zealot("질럿2", 100, 10);
        ProtossUnit dra1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit dra2 = new Dragoon("드라군2", 100, 5);
        ProtossUnit dark1 = new Dragoon("다크1", 100, 15);
        ProtossUnit dark2 = new Dragoon("다크2", 100, 15);
        // 질럿이 드라군 공격
        attack(zeal1, dra1);
        attack(dra1, zeal1);
        attack(dra1, dra2);
        attack(dark1, dark2);
    }
}
