package ex03;

public class Gugudan {
    public static void main(String[] args) {
        // 상수 = 변하지 않는 값 , 변수 = 변하는 값을 먼저 확인
        int total = 0;
        // 마지막 결과 값을 도출하고 싶다면
        // 선언만 해서는 안되고 초기화 시켜주어야한다

        for (int i = 2; i <= 9; i++) {
            System.out.println();
            System.out.println(" * " + i + " 단 *");
            for (int j = 1; j <= 9; j++) {
                total = i * j;
                System.out.println(i + " x " + j + " = " + total);
            }
        }
        System.out.println("마지막 결과 값" + total);
    }
}
