package ex05.ch02;

// 상속된 추상화 클래스가 있는 것을 호출하면 값이 튀어나온다는 것은 오버라이드됐다고 생각하면 됨

abstract class ProtossUnit {
    abstract int getAttack();

    abstract int getHp();

    abstract int setHp(int hp);

    abstract String getName();
}
