package ex04;

class DeskLampValue {
    Boolean isOn; // boolean 타입의 변수명을 지정해줄 때는 is를 사용한다.

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    String print() {
        return "전원 버튼이" + (isOn == true ? "켜짐" : "꺼짐");
    }
}

public class DeskLamp {

    public static void main(String[] args) {
        DeskLampValue desk = new DeskLampValue();
        desk.turnOn();
        System.out.println(desk.print());
    }
}
