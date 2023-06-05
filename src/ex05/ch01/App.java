package ex05.ch01;

// 오버로딩 = 가면 갈수록 이름 짓기 힘들기 때문에 써먹는 것 
// 오버로딩의 단점 - 경우의 수가 많아지면 사용이 안됨
// void run() {} // run();
// void run(int i) {} // run(1);
// void run(String s) {} run("1");
// void run(int i, int b) {} run(1,2);
// 타입이나 개수가 달라도 인식 

// 상속은 타입일치성, 다형성 

// App이라는 이름을 지으면 main이 있는 파일

// 로직을 짜는 쉬운 방법
//미리 필요한 메서드를 다 만들어놓고 호출하면서 확인하기
public class App {
    static void attack(Zealot ul, Dragoon u2) {
        // 어택보따리는 밑에 내용을 모름 (공유가 안됨)
        // -> 내가 들고 있는 주소값을 전달하기 위해서는 매개변수를 사용해야함
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot ul, Zealot u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Zealot ul, DarkTempler u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    // static void attack2(Dragoon d1, Zealot z1) {
    // d1.hp = d1.hp - z1.attack;
    // System.out.println(d1.name + "이 공격당했습니다");
    // System.out.println(d1.name + "의 남은 hp : " + d1.hp);
    // 모듈화가 안된 코드
    // }

    static void attack(Dragoon ul, Zealot u2) {
        // 어택보따리는 밑에 내용을 모름 (공유가 안됨)
        // -> 내가 들고 있는 주소값을 전달하기 위해서는 매개변수를 사용해야함
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon ul, Dragoon u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(Dragoon ul, DarkTempler u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler ul, Dragoon u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    static void attack(DarkTempler ul, DarkTempler u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    static void attack(DarkTempler ul, Zealot u2) {
        u2.hp = u2.hp - ul.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        // 질럿1이 질럿2를 공격하는 메소드
        Zealot z1 = new Zealot("질럿1", 100, 10);
        Zealot z2 = new Zealot("질럿2", 100, 10);
        Dragoon d1 = new Dragoon("드라군1", 100, 5);
        Dragoon d2 = new Dragoon("드라군2", 100, 5);
        DarkTempler dk1 = new DarkTempler("다크1", 100, 50);
        DarkTempler dk2 = new DarkTempler("다크2", 100, 50);
        // 메인 보따리는 힙에 접근해야 알 수있음

        // 클래스를 통째로 넘기면 모든 것들을 확인할 수 있음

        // attack(d1,z1);
        // attack2(d1, z1);

        // 질럿 -> 드라군 공격
        attack(z1, d1);
        // 질럿 -> 질럿 공격
        attack(z1, z2);
        // 질럿 -> 다크 공격
        attack(z2, dk2);

        // 드라군 -> 질럿 공격
        attack(d1, z1);
        // 드라군 -> 드라군 공격
        attack(d1, d2);
        // 드라군 -> 다크 공격
        attack(d2, dk2);
        // 다크 -> 드라운 공격
        attack(dk1, d2);
        // 다크 -> 질럿 공격
        attack(dk1, z1);
        // 다크 -> 다크 공격
        attack(dk1, dk2);

        // attack(d1,z1); 타입 미스매치 , 타입을 바꾸려고 하는 것
        // 오버로딩=> 하나의 메서드의 여러가지의 기능을 부여하는 것

        // 오버로딩 체험하기
        System.out.println();
        System.out.println(1);
        System.out.println(1.1);
        System.out.println('가');
        System.out.println(true);
        System.out.println("문자열");

    }
}
