package ex01;

public class Var04 {
    // 문자열
    public static void main(String[] args) {
        String s1 = "가나다";
        // 자료형이 아니라 클래스
        // 문자열을 저장하고 싶으면 첫문자는 대문자
        System.out.println(s1);

        //연결연산자 + 
        String name = "코난";
        int age = 12;
        
        System.out.println("이름은 " + name + "이고 나이는 " + age + "살이다");
        System.out.println( name + "의 나이는 " + age + "살이다");
    }
}
