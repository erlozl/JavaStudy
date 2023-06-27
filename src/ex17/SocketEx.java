package ex17;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketEx {
    public static void main(String[] args) throws Exception {
        try (Socket s = new Socket("time-c.nist.gov", 13)) {
            // 첫번째 인수는 사이트 주소, 두번째 인수는 포트번호
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
        }
    }
}
