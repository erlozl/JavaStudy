package ex04;

// public은 하나의 클래스에 하나만 있어야 함
class Player {
    String name;
    int thirty; // 0 ~ 100 (클수록 목말라짐) - 범주가 있는 데이터(if로 처리)

    public void drink() {
        thirty = thirty - 30;
        // 생성자가 리턴을 못하기 때문에 힙에 있는 변수에 값을 저장해서
        // thirty = 100 이라는 값이 저장이 되어서
        // 70이라는 값이 됨
    }

    // 생성자의 스택 > 상태를 초기화하는 게 목적
    public Player(String name, int thirty) {
        // 생성자에는 값이 생성자 스택에만 들어감
        this.name = name;
        this.thirty = thirty;
        // 내부는 실행시에 열림
        // 가까이에 있는 것을 찾음
        // heap변수는 this를 붙여줌

        // 외부에서 받은 네임을 힙에다가 옮긴다
    }

}

public class OOP01 {
    public static void main(String[] args) {
        // 디폴트 생성자 호출
        Player p1 = new Player("홍길동", 100);
        Player p2 = new Player("임꺽정", 100);
        // 변수를 선언했는데 값이 없는 것을 null 이라고 함

        // 디폴트 생성자 = 메서드 없으면 자동으로 만들어줌
        // 내가 안 적어도 있음
        // 디폴트 생성자는 내가 무엇을 만들면 안 만들어줌

        // 차이점
        // 생성자는 클래스이름으로 만들어짐

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();
        System.out.println(p1.thirty);
        System.out.println(p2.thirty);
    }
}
