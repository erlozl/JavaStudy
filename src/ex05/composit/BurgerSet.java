package ex05.composit;

// public class BurgerSet extends Burger,Coke{} 다중 상속 안됨
// composition 결합 
// 본인의 상태를 들고있으면 됨  
public class BurgerSet {
    // private Burger burger = new Buger();
    // 미리 이렇게 넣어놓으면 디폴트 값이 정해져있기 때문에 컨트롤 할 수가 없음

    private Burger burger;
    private Coke coke;
    private Potato potato;
    // Private Tender tender;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
    }

    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}
