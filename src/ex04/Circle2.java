package ex04;

class diCircle {
    int radius;
    String color;

    double getCircle() {
        return 3.14 * radius * radius;
    }
}

public class Circle2 {
    public static void main(String[] args) {
        diCircle dic = new diCircle();
        diCircle dic2 = new diCircle();

        dic.radius = 100;
        String dicColor = dic.color = "blue";

        dic2.radius = 200;
        String dicColor2 = dic2.color = "red";

        double result = dic.getCircle();
        double result2 = dic2.getCircle();
        System.out.println("원의 면적은 " + result + " 이고 " + "색깔은 " + dicColor + " 이다");
        System.out.println("원의 면적은 " + result2 + " 이고 " + "색깔은 " + dicColor2 + " 이다");
    }
}
