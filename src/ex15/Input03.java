package ex15;

// BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 키보드로 입력받아서 모니터로 던지기 = 읽기의 기본
        // 비교해봤을 때 Scanner랑 똑같음

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}