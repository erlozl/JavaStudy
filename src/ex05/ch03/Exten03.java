// package ex05.ch03;

// // 공통 모듈을 만들고 싶다 - 메서드 하나

// class Dog {
// // 1. 상태
// // String name;
// // String color;

// // 2. 행위
// void speak() {
// System.out.println("멍멍");
// }

// }

// class Cat {
// // String name;
// // String color;

// void speak() {
// System.out.println("야옹");
// }
// }

// public class Exten03 {
// // 게임을 시작하는 메서드
// 참조 타입
// 변수는 객체의
// 주소를 저장하는 역할

// static void start(Dog u) {
// u.speak();
// }

// static void start(Cat u) {
// u.speak();
// }
// // 내부를 변경할 필요없고 타입만 변경 < 오버로딩

// public static void main(String[] args) {
// Dog d = new Dog();
// start(d);
// Cat c = new Cat();
// start(c);
// }
// }
