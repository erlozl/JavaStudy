package ex03;

// 프로그래밍에서 리팩토링이란
// 깔끔하게 코드를 짜는 것 (코드 짜는 단계법)
public class MyStar01 {
    public static void main(String[] args) {

        // for (int i = 0; i <= 5; i++) { // 행을 반복
        // System.out.println();
        // for (int j = 0; j < i; j++) { // 열을 반복
        // System.out.print("*");
        // }
        // }
        // // *
        // // **
        // // ***
        // // ****
        // // *****p

        // System.out.println();

        // for (int i = 5; i >= 0; i--) {
        // System.out.println();
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // }
        // // *****
        // // ****
        // // ***
        // // **
        // // *

        // System.out.println();

        // int end = 0;

        // end = (end * 1) + 1;
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // end = (end * 1) + 2;
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // end = (end * 1) + 2;
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // end = (end * 1) - 2;
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // end = (end * 1) - 2;
        // for (int i = 0; i < end; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
