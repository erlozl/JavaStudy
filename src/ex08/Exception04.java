package ex08;

import java.io.FileReader;
import java.io.IOException;

// 예외 떠넘기기
public class Exception04 {
    public static void main(String[] args) throws IOException {
        // 입출력 예외가 발생하면 상위 메소드로 예외를 던져서 처리하겠다는 의미
        FileReader fr = new FileReader("test.Txt");
        char[] a = new char[50];
        fr.read(a);
        for (char c : a)
            System.out.println(c);
    }
}
