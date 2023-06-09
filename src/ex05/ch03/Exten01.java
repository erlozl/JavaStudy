package ex05.ch03;

// 자식은 부모를 두 부모를 섬길 수 있지
// 부모한테 영향 받는 자식은 여러명 있을 수 있지

// 다형성을 만족하는 관점에서 보기
// 추상화가 다형성을 성립하면 같은 타입으로 묶어준다

class 지구인 {
    String name = "지구인";
}

class 아시아인 extends 지구인 {
    void speak() {
        // 오버라이드(무효화하다) 됨 ㅡ> 재정의 X
        System.out.println("아시아어");
    }

}

class 한국인 extends 아시아인 {
    // class 자식 extends 부모
    // 재정의
    void speak() {
        System.out.println("한국어");
        // 오버라이드 : 부모가 들고 있는 메서드를 같은 이름으로 똑같이 만들면 재정의라고 함
        // 자식이 똑같은 메서드를 들고 있으면 부모가 오버라이드(무효화)됨
    }
}

class 홍길동 extends 한국인 {
}

// 클래스자체가 크니 그걸 부모로 = 인스턴스 생성이 되는 건 자식으로 이해해보자

public class Exten01 {
    public static void main(String[] args) {
        아시아인 p1 = new 한국인();
        // 부모로부터 모든 걸 물려받을 수 있다
        // new홍길동하면 다 상속받음
        p1.speak();
        지구인 z1 = new 한국인();
        // z1.speak();
        아시아인 a1 = new 홍길동(); // 홍길동아 너 아시아인이니? OK
        // 아시아인 z1 = new 지구인(); // 같은 사람이기에 오류
        // 한국인 p1 = new 아시아인(); // 다형성 성립 안됨

        // 홍길동 p1 = new 한국인();
        // new 했을 때 위에 뜨는 거 찾기

        // 힙이 어떻게 생기냐면 홍길동을 부를 수 있는 이름 4가지
        // 지구 아시아 > 한국 > 홍길동

        // 타입이 메모리 공간에 위치를 가리키고 있다.
        // 4가지 다 들어갈 수 있다

    }
}
