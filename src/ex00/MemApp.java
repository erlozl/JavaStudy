package ex00;

class 엘리스 {
    static String name = "엘리스";
    int height = 160;

    public 엘리스() {
    }

    void eat(int qty, int height) {
        // this.height = height + (10 * qty); // 180

        this.height = this.height + (10 * qty); // 210
    }
}

public class MemApp {
    public static void main(String[] args) {
        엘리스 e = new 엘리스();
        e.eat(5, 130);
        // e2.eat(20, 160);
        System.out.println(e.height);
    }
}

// 인긴 이해하는 영어
// .java 파일
// java파일을 컴파일하면 .class
// .class를 실행시키려고 하는데, JVM이라고 하는 애가 실행시킴
// 클래스 로드 한 다음
// static 키워드를 "먼저" 찾고 / static을 붙이면 메모리에 띄어줄게 약속한거니까 그냥 알아들어
// static를 분석하고 나서 static 로드를 함 (로드한다는 건 메모리를 끌어올린다는 것)
// 엘리스 static은 name ="앨리스가 들어가있고"
// MemAPP stati 은 main이 들어가있음 각각 있어
// main 실행 / 근거 -
// (무조건 public이 있어야 찾을 수 있음, static 메모리에 떠야 실행시킬 수 있다,이름이 메인이어야 함)
// main에 Q와 Stack이 생김 / main도 메서드니까
// static한테 클래스변수라고 하는 이유는 클래스 안에 있으니까
// 하나만 만들어지고 모든 애들이 공유해서 쓰기 때문에 공유변수라고도 함 > static (모든 객체가 공유가능)
// heap은 무조건 타입이 필요함 > 자료형 앨리스타입
// 일정하지 않은 데이터 heap 데이터 (this 힙데이터, 힙변수 : 구분할라고)
// this 다른 클래스 안에 있으면 구분못함
// reference 변수 > 타입이 없다는 것, 크기가 동적이라서 (서치해보기)
// 값이 있는 곳을 pointing 한다고 해서 pointer라고 함
// stack 은 데이터 저장 공간 eat 메소드가 기억해야할 공간 eat stack
// stack은 stack끼리 못 찾는다.
// 같은 클래스에 있으면 this, 다른 클래스에 있으면 매개변수로 전달받음
// stack은 stack끼리 접근 못함 / 메서드에서 만들어진 스택은 메서드에 접근 못함
// stack은 자기 heap 변수에 접근 가능

// 1. 메서드 내부에서 만든 변수는 지역변수
// 2. 클래스 내부에서 만든 변수는 힙변수 static이 안 떠있으면 힙변수
// class Hello {
// void haha() {
// System.out.println(num);
// }
// }
// class Hi {
// // int num = 10;
// // void hello() {
// // int num = 10;
// // System.out.println(num);
// // System.out.println(this.num) > 힙변수에 접근하고 싶다면;
// // }
// }

// 3. 메서드 내부에서 -> 본인 클래스 힙변수 접근이 된다
// 4. 메서드 내부에서 -> 다른 메서브 변수 접근은 안된다
// 5. 메서드 내부에서 다른 힙변수(다른 new에 있는 변수?)에 접근은 안됨
// - 본인의 힙변수에서 접근 가능 - this
// 6. 다른 힙변수에 접근하고 싶다면 매개변수, 인수로 전달

// java에서 메인이 되면 process가 된다
// 프로세스에서 static , stacl ,heap 영역이 나뉜다
// 통으로 쓰면 메모리를 너무 많이 사용함
// -효율적인 공간을 활용하기 위해서
// -실행시에 데이터가 다르기 때문에
// 처음 - static (클래스가 없는 언어는 static공간이 없다)
// 메서드(행위) - stack ex)달리기,이체하기 등등 - 지역변수로 저장
// 동적 - heap - 갑자기 나타났다가 사라짐 new
// 자바의 자료형을 나누기 위함은 공간을 효율적으로 쓰기 위해
// 자료형으로서의 new
// 내가 저장하고 싶은 계좌 정보가 있다면
// 계좌번호
// 패스워드
// 소유
// 클래스로 하나 만들고
// 계좌번호 저장은 String
// 클래스 자료형 => 데이터를 저장하고 싶을 때만 사용(행위X)
