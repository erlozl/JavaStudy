package ex13;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<String>();

        arrays.add("Apple");
        arrays.add("Banana");
        arrays.add("Mango");
        arrays.add("Pear");
        arrays.add("Grape");

        int index = arrays.indexOf("Mango"); // ArrayList에 저장된 문자열 검색
        System.out.println(index); // 2
    }
}
