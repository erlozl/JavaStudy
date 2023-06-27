package ex17;

import java.io.IOException;
import java.net.InetAddress;

// InetAddress IP주소를 표현하고 다루는 클래스
public class HostEx {
    public static void main(String[] args) throws IOException {
        String hostname = "www.naver.com";
        String localname = "";
        try {
            InetAddress address = InetAddress.getByName(hostname);
            InetAddress address2 = InetAddress.getByName(localname);
            System.out.println("IP주소 : " + address.getHostAddress());
            // IP주소 : 223.130.195.200
            System.out.println("IP주소 : " + address2.getLocalHost());
            // 자신의 컴퓨터 IP주소 알기
            // IP주소 : DESKTOP-1FFOQKL/192.168.200.41
        } catch (Exception e) {
            System.out.println(hostname + "의 IP주소를 찾을 수 없습니다");
        }
    }
}
