package ex05.composit;

// 상속의 주 목적 - 추상화 ( 타입 일치 시키기) 
// 부모를 불러서 일 시키는 거임
public class BigBurger extends Burger {

    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다");
    }

    public BigBurger(int price) {
        super(price, "빅버거");
        System.out.println("빅버거가 만들어졌습니다");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다");
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

}
