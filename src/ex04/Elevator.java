package ex04;

public class Elevator {
    public static String guide(int floor) {

        // 저층은 1~10층, 고층은 11-20층
        String result = (floor > 10 && floor <= 20) ? ((floor > 1 && floor <= 10) ? "저층" : "고층") : "저층";
        return result;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        System.out.printf("%d층 => %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 => %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 => %s 엘레베이터\n", c, guide(c));
    }

}
