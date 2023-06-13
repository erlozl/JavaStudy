package ex06;

interface Remocon {
    void on();

    void off();
}

class 삼성 implements Remocon {
    @Override
    public void off() {
        System.out.println("티비 끄다");
    }

    @Override
    public void on() {
        System.out.println("티비 켜다");
    }
}

class 엘지 implements Remocon {
    @Override
    public void off() {
        System.out.println("티비 끄다");
    }

    @Override
    public void on() {
        System.out.println("티비 켜다");
    }
}

public class Inter01 {

    public static void getOn(Remocon re) {
        re.on();
        re.off();

    }

    public static void main(String[] args) {
        Remocon s1 = new 삼성();
        getOn(s1);

        Remocon s2 = new 엘지();
        getOn(s2);
    }
}