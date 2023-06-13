package ex05.composit;

public class Coke {
    private int price;
    private String desc;

    public Coke() {
        this(500, "콜라");
        System.out.println("콜라 나왔습니다");
    }

    public Coke(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
