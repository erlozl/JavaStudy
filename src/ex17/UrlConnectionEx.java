package ex17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// HTTP연결 통하여 인터넷에서 파일 읽기
// 1. URL클래스의 객체 생성
// 2. URL객체를 이용해서 연결하기 위하여 UrlConnection 객체 생성
// 3. URLConnection객체의 getInputStream()메서드 호출 입력 스트림 얻기
// 4. 스트림에서 데이터 얻기
public class UrlConnectionEx {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.naver.com");
        URLConnection url = site.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
        String inLine;
        while ((inLine = in.readLine()) != null) {
            // inLine 변수가 null이 아닐 때까지(즉, 입력 스트림에서 더 이상 읽을 데이터가 없을 때까지) 루프를 반복
            // in.readLine() 메서드는 입력 스트림에서 한 줄씩 데이터를 읽어오고, 읽은 데이터는 inLine 변수에 할당
            System.out.println(inLine);

        }
        in.close();

    }
}
