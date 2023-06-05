package ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle circleArea = new Circle();

        int radiusArea = 100;
        double circleValue = circleArea.findCircle(3.14, radiusArea);
        System.out.println(circleValue);
    }
}
