package ex03;

public class For01 {
    public static void main(String[] args) {
        // for(초기식; 조건식; 증감식;) {
        // 실행 문장;
        // }

        for (int i = 31; i >= 5; i--) {
            // i++ == i=i+1
            // 1. 초기값 최초의 확인
            // 2. i가 11보다 작은지 확인 맞으면 true
            // 3. 조건 실행
            // 4. 다시 올라와서 증가시킴

            System.out.println(i);
        }

        int[] score = new int[3];
        score[0] = 90;
        score[1] = 80;
        score[2] = 70;
        System.out.println(score.length + "score");
        for (int i = 0; i < score.length; i++) {
            int number = (int) (i * 10);
        }

    }
}
