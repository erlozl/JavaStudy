package tra;

abstract class Shape {
    // 추상 클래스라고 하더라도 추상 메소드가 아닌 보통의 메소드도 가질 수 있다
    int x, y;

    public void translate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 추상 메소드가 아닌 일반 메소드로 정의되면 자식 클래스에서
    // 오버라이드하지 않아도 컴파일러가 체크할 방법이 없다
    abstract void draw(String color);
}

class Rectangle extends Shape {
    int width, height;

    void draw(String color) {
        System.out.println("사각형 그리기 메소드");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("color: " + color);
    }
}

class Circle extends Shape {
    int radius;

    void draw(String color) {
        System.out.println("원 그리기 메소드");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("radius: " + radius);
        System.out.println("color: " + color);
    }
}

public class Tra18 {
    public static void main(String[] args) {
        Shape sh = new Circle();
        sh.x = 10;
        sh.y = 20;
        ((Circle) sh).radius = 5;
        // shape 타입으로 선언되었기 때문에,
        // radius가 있는 Circle을 (Circle)sh로 형변환해줘야 한다
        // radius라는 변수가 부모한테 있다면 안해줘도 됨

        sh.draw("Red"); // 매개변수로 color 값 전달
    }
}