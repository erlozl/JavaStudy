package ex01;

public class Var02 {
    public static void main(String[] args) {
        byte b1 = 65; // 1Byte
        int n1 = 2100000000; // 4Byte , 숫자는 int
        long l1 = 21000000000L; // 8Byte , long은 대문자 L필수
        double d1 = 2100000000.111; // 8byte , 실수는 double
        char c1 = '가'; // 2byte , 문자는 홑따옴표를 쓴다
        boolean check = true; // 1bit

        // 타입 = 값이 일치해야함

        System.out.println(b1);
        System.out.println(n1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(check);
    }
}
