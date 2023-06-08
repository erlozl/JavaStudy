package ex05.exam;

// 변수, 메서드 이름 맞추는 게 중요
abstract class Carnivore {
    abstract void setName();
}

class Tiger extends Carnivore {
    // 상태
    String name;
    int height;
    int weight;

    // 생성자를 만드는 이유 -> 각각의 객체를 생성하기 위해서
    // 생성자
    public Tiger(String name) {
        this.name = name;
    }

    // 행위
    public void setName() {
        System.out.println(name);
    }
}

class Lion extends Carnivore {
    // 상태
    String name;
    int height;
    int weight;

    // 생성자
    public Lion(String name) {
        this.name = name;
    }

    // 행위
    public void setName() {
        System.out.println(name);
    }
}

public class ExtenExam {
    // Carnivore의 객체를 받음으로서 상속이 되어있기 때문에
    // 어떤 자식 클래스의 객체를 전달하더라도 일관된 방식으로 동작

    static void getName(Carnivore carn) {
        // 여기서 나오는 getName가 다형성의 좋은 예
        // 메서드의 매개변수 타입이 Carnivore로 선언되어 있기 때문에
        // Carnivore를 상속받은 다양한 자식 클래스의 객체를 전달할 수 있다.

        carn.setName();
    }

    public static void main(String[] args) {
        Carnivore tiger = new Tiger("호랑이");
        Carnivore Lion = new Lion("사자");

        // 어떤 메소드를 통해서 타이거 이름이랑 사자 이름 불러오기
        getName(tiger); // 호랑이
        getName(Lion); // 사자

    }
}
