package ex05.composit;

public class ExApp01 {
    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger(800, "버거");
        Burger b3 = new Burger(500);

        BigBurger bb1 = new BigBurger();
        BigBurger bb2 = new BigBurger(1300, "빅버거");
        BigBurger bb3 = new BigBurger(800);

    }
}
