package ex06;

// Object는 new할 수있는 모든 object의 최상위 부모 extends Object 안 적어줘도 생략되어있음
// new를 하는데 딱 하나만 유지하는 것 - 싱글톤
class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다");
    }

}

// 하나만 유지해야 하는 객체
class 바론 {
    // 단 한번만 실행
    private static 바론 instance = new 바론();

    public static 바론 getInstanc() {
        return instance;
    }

    // 1번 private로 접근하지 못하게 잠군다 그럼 new가 안됨
    private 바론() {
    };

    // public 바론 make() {
    // return new 바론();
    // } 안됨

}

public class Single01 {
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        바론 b1 = 바론.getInstanc();
        바론 b2 = 바론.getInstanc();
        // 코드가 두 번 떠있다해도 메모리에 올라와있는 건 하나임

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        // 해당 코드를 특정번호로 보여주는 코드 = hashCode
        // 번호가 같으니까 동일한 메모리 공간

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        // 타입 확인
        if (b1 instanceof 바론) {
            System.out.println("같은 타입입니다");
        }

        if (b1 instanceof Object) {
            System.out.println("바론과 오브젝트는 같은 타입입니다");
        }

        String str = "안녕";
        Object obj = str; // 묵시적 형변환

        // Char로 만든 배열 ㅡ> String임
    }
}
