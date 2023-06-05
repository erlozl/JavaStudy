package ex01;

public class Var01 {
    public static void main(String[] args) {
        // 4byte = 43억 경우의 수
        // n1의 주소가 1인 자리를 찾을 수 있다는 것은 타입이 있기 때문에
        int n1 = 7;
        // 메모리에 4바이트 공간 확보해
        // 그 공간이 n1 
        // n1에 7을 할당
        System.out.println(n1);
        // 모니터에 7을 아웃풋
        n1 = 20;
        // 오류 n2 = 20; 공간 확보 안됨
        // 오류 int n1 = 20; // 공간이 똑같이 때문에 충돌
        System.out.println(n1);
    
    }
}
