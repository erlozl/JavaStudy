package ex05.composit;
// 다향성을 만족하니까 - 상속 (Bigburger)

// 객체지향기본문법 예제
public class Burger {
    private int price;
    private String desc;
    // 직접적으로 변수 못 건들게 하려고

    public Burger() {
        this(1000, "버거");
        // this() 생성자 < 자기 자신

        // 디폴트 전략
        // (계속 값 넣기 귀찮기 때문에 빈 생성자로 this로 인해 자기 자신 호출)
        // 생성자 오버로딩
    }

    public Burger(int price) {
        this(price, "버거");
        // 버거 자체를 다시 적을 필요가 없음
        // 가격만 바꾸면 됨
    }

    public Burger(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("버거가 만들어졌습니다");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    // 값을 확인하는 gatter가 필요함

}
