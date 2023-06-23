package ex08;

import java.io.FileReader;
// FileReader는 파일로부터 문자 단위로 데이터를 읽을 때 사용
import java.io.IOException;

// numberFormat 예외처리
public class Exception03 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.Txt")) {
            char[] a = new char[50];
            fr.read(a);
            for (char c : a)
                System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
