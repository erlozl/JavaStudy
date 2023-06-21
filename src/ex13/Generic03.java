package ex13;

class Data<T> {
    int status; // 숫자
    T body; // 값
}

public class Generic03 {
    // 리턴하는 타입을 동적으로 변경할 수 있음 <?>
    // 와일드카드 문법
    // <?> == object랑 똑같다고 보면 됨

    Data<?> getNum(int check) {
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {
            Data<Integer> data = new Data<>();
            return data;
        }
        // return 1;
    }

    // void일 때는 Object로 사용
    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        int n = (int) g3.getNum2(1);

        Data<?> d = g3.getNum(1);
        // 다운 캐스팅가능
    }
}
