package ex02;

// ※ 클래스 하나를 만들었을 때
// * 클래스 안에 static이 없다면 new를 사용하여 타입을 변경시켜줌
// 그리고 그 네임명을 사용하여 불러낸다

// * 클래스 안에 static이 있다면 바로 출력 가능
// 행위 안에 있는 자료형 형

class Hello {
    static int price = 1000;
    String name = "커피";

    void run(){
        int n = 100;
        // 이것은 밖으로 내보낼 수 있는 방법이 없다
        System.out.println("달린다");
        System.out.println(n);
    }
}

class People {
    int number = 300; 
    void running() {
        System.out.println(number + "명의 사람이 달린다");
    }
}

class fruit {
    static String apple = "사과";
}
class Season {
    void winter() {
        System.out.println("겨울이 좋아");
    }
}
public class Mem01 {
    static int price = 10000;

    public static void main(String[] args) {
        System.out.println(Mem01.price); // 10000
        System.out.println(Hello.price); // 1000

        People people = new People(); 
        System.out.println(people.number); // 300

        Hello c = new Hello(); 
        System.out.println(c.name); // 커피

        Season d = new Season(); 
        System.out.println(fruit.apple); // 사과
         
        d.winter(); // 겨울이 좋아
        c.run(); // 100
        people.running(); // 300명의 사람이 달린다
    }
}