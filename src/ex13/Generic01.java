package ex13;

// 보통은 T라고 많이 넣음
class Box<T> {
    T num;
}

public class Generic01 {
    public static void main(String[] args) {
        // Interger 숫자밖에 못 넣음
        Box<Integer> b1 = new Box<>();
        b1.num = 1;
        System.out.println(b1.num);

        Box<Double> b2 = new Box<>();
        b2.num = 1.0;
        System.out.println(b2.num);

    }
}
