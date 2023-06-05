package ex03;

public class While01 {
    public static void main(String[] args) {
        // for -> 끝이 있는 반복문
        // while -> 끝을 모르는 반복문

        // while(조건식) {}

        // 결과를 반환하는 것 return

        int i = 1;
        while (true) {
            if (i == 101) {
                break; // 반복문을 빠져나가게 하는 것
            } // 조건은 맨 위에
            System.out.println("Hello : " + i);
            i++;
        }
    }
}
