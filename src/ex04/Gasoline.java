package ex04;

// 자동차의 연비 계산하기
public class Gasoline {

    public static double calcEffiency(double fuel, double distance) {
        double efficieny = distance / fuel;
        return efficieny;
    }

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficieny = calcEffiency(gasoline, distance);

        System.out.printf("연비 : %.2f km/L", efficieny);

    }
}
