package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ArrayList도 가변 크기의 배열을 구현하는 클래스
// ArrayList는 동기화를 하지 않음 - 여러명이 동시에
// ArrayList를 생성하려면 타입 매개변수를 지정
// 객체 데이터 저장 add(value), add(index,value)
// 객체 특정 위치 원소 바꾸려면 set (indx,value)
// 데이터 삭제 remove(index)
// 저장된 객체 가져오기 get(index)

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // public String toString() {
    // return "x = " + x + " y = " + y;
    // }
}

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>(); 기본형태
        // Array.asList()메소드는 배열을 받아서 리스트 형태로 반환
        ArrayList<Point> point = new ArrayList<>();
        System.out.println(point.add(new Point(100, 0)));
        point.add(new Point(20, -30));
        point.add(new Point(50, 1));
        point.add(new Point(77, 23));
        point.add(new Point(40, 6));

        System.out.println(point);
    }
}
