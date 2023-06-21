package ex13;

// 나한테 객체 생성의 결정권이 없을 때
// Object 타입
// 나한테 객체 생성의 결정권이 있을 때
// generic 타입
class president {
    private Object data;
    // New를 못할 때는 어떤 타입이 들어올지 모르니까
    // Object으로 해놓음
    private static president instance = new president();

    // new를 할 때 타입을 선택하게 해주겠다
    public static president getInstance() {
        return instance;
    }

    private president() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        president p1 = president.getInstance();
        p1.setData(1);

        int value = (int) p1.getData();
        // 오브젝트타입으로 다운캐스팅해야 할 때는
        // 미리 만들어놓은 객체이기 때문에 땡겨쓸 때
        System.out.println(value);

    }
}
