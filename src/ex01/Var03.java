package ex01;
// 형변환
public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅, 묵시적 형변환 ( 작은 것을 큰 것에 넣는 것 )
        int n1 = 10;
        double d1 = n1;
        // double의 크기가 더 크므로 n1은 d1의 대입이 가능함
        // double d1;
        // 값이 안들어왔을 때 선언이라고 함
        System.out.println(d1); // 10.0 형이 더블형으로 변환되었기 때문에 10.0으로 출력
        
        // 다운 캐스팅, 명시적 형변환 ( 큰 것을 작은 것에 넣는 것 ) - 데이터 유실
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2); // 10 형이 int형으로 변환되었기 때문에 10으로 출력

        // 문자 형변환 (아스키코드)
        byte ch = 65;
        char data = (char) ch;
        System.out.println(ch); // 65

        // byte ch2 = 65;
        // char data2 = ch2;
        // System.out.println(data2); 오류 / 타입이 아예 다르기 때문에 오류

        byte ch2 = 65;
        char data2 = (char) ch;
        System.out.println(data2); // AA

    }}
