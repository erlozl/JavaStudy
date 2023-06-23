package ex15;

// BufferedReader
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {
        // 연결(키보드)
        try {
            InputStream in = new FileInputStream("input.txt");
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);
            // 버퍼를 비운다는 듯 = br.readLine()

            // if(br.readLine() != null) ?
            String allData = "";
            while (true) {
                String data = br.readLine();
                allData = allData + data;

                if (data == null) {
                    break;
                }
                System.out.println(allData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 파일을 받아오는 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}