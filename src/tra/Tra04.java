package tra;
// 조건연산자
public class Tra04 {
    public static void main(String[] args) {
        double circle = 3.141592;
        double pizza1 = (20 * circle * 20) * 2;
        double pizza2 = (30 * circle * 30) * 1;

        System.out.println("20cm 피자" + pizza1);
        System.out.println("30cm 피자" + pizza2);
        System.out.println(pizza1 < pizza2 ? "30cm피자" : "20cm피자");
                                           //  참      :    거짓
    }
}
