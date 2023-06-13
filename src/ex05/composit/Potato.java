package ex05.composit;

// 클래스 상속 - 추상적인 게 아니기 때문에
// 양념 감자같은 거 만들 때 상속
public class Potato {
    private int price;
    private String desc;

    public Potato() {
        this(800, "감자튀김");
    }

    public Potato(int price, String desc) {
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
