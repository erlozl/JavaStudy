package tra;

interface RemoteControl {
    void turnOn();

    void turnOff();

    public default void printBrand() {
        System.out.println("Remote Control 가능 TV");
    };

}

interface AdvancedRemoteControl extends RemoteControl {
    public void volumeUp();

    public void volumeDown();
}

class Television implements RemoteControl {
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("전원을 켜다");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("전원을 끄다");
    }

    public void printBrand() {
        System.out.println("power java TV입니다");
    }

}

public class Tra19 {
    static boolean on = true;

    public static void main(String[] args) {
        RemoteControl tv2 = new Television();
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        tv.printBrand();
        tv2.printBrand();
    }
}
