package ex15;

import java.io.IOException;
// 추상클래스- 무엇인가를 읽을 때의 부모
// new InputStream() {};
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // 연결 (키보드) 1byte만 읽을 수 있음
        InputStream in = System.in;
        // Input = read

        // 읽기
        try {
            int data = in.read(); // 대기
            System.out.println(data); // 65
            // 숫자로 받음
            // 모니터에 쓰다라는 뜻
            System.out.println((char) data); // A
        } catch (IOException e) {
            e.printStackTrace();
            // 오류 났을 때 모든 오류를 다 보여준다는 얘기
        }
        // byte라서 int로 받음
    }
}
