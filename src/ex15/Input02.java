package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        // 읽은 걸 문자로 변환 (캐스팅 안해도 됨)

        // 읽기
        try {
            char[] ch = new char[5];
            // 레퍼런스 변수 == 참조변수
            ir.read(ch);
            for (char c : ch) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
