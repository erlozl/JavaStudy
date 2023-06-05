package ex04;

class PizzaType {
    int size;
    String type;

    PizzaType() {
        size = 12;
        type = "고구마피자";
    }

    PizzaType(int s, String t) {
        size = s;
        type = t;
    }
}

public class Pizza {
    public static void main(String[] args) {
        PizzaType ptype = new PizzaType();
        System.out.println(ptype);
        System.out.println(ptype.size);
        PizzaType ptype1 = new PizzaType(16, "고르곤졸라");
        System.out.println(ptype1.size);
    }
}
