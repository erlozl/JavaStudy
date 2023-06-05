package ex04;

public class RareItem {
    int hp;
    int mp;

    public static void wear(int hp, int mp) {

        if (hp >= 2000 && mp >= 2000) {
            System.out.println("아이템 장착 완료");
        } else if (hp >= 2000 && mp > 2000) {
            System.out.println("아이템을 착용할 수 없습니다.");
        } else {
            System.out.println("체력이 부족합니다");
        }
        // 해당 메소드를 완성하시오
    }

    // RareItem() {
    // this.hp = hp;
    // this.mp = mp;
    // } 이게 없어도 되는 이유는

    public static void main(String[] args) {
        RareItem Rare = new RareItem();
        Rare.wear(2400, 2000); // 체력 2400, 마력 2000 => 아이템 장착 완료
        Rare.wear(3800, 1200); // 체력 3800, 마력 1200 => 아이템을 착용할 수 있습니다.

    }
}

// package ex04;

// public class RareItem {

// public void wear(int hp, int mp) {

// if (hp >= 2000 && mp >= 2000) {
// System.out.println("아이템 장착 완료");
// } else if (hp >= 2000 && mp < 2000) {
// System.out.println("아이템을 착용할 수 없습니다");
// } else {
// System.out.println("체력이 부족합니다");
// }
// // 해당 메소드를 완성하시오
// }

// public static void main(String[] args) {
// RareItem r1 = new RareItem();
// r1.wear(2400, 2000); // 체력 2400, 마력 2000 => 아이템 장착 완료
// RareItem r2 = new RareItem();
// r2.wear(3800, 1200); // 체력 3800, 마력 1200 => 아이템을 착용할 수 있습니다.
// }
// }
