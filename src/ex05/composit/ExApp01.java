package ex05.composit;

public class ExApp01 {
    public static void getValue(Burger u, Burger n) {
        System.out.println("버거 가격은 " + u.getPrice() + "고 " + "햄버거 가격은 " + n.getDesc() + "입니다");
    }

    public static void main(String[] args) {

        // Burger b1 = new Burger();
        Burger b2 = new Burger(800, "버거");
        // Burger b3 = new Burger(500);

        // BigBurger bb1 = new BigBurger();
        BigBurger bb2 = new BigBurger(1300, "빅버거");
        // BigBurger bb3 = new BigBurger(800);

        // System.out.println(bb2.getPrice());
        // System.out.println(b3.getPrice());
        // System.out.println(b2.getPrice());

        getValue(b2, bb2);

    }
}
