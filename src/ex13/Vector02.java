package ex13;

import java.util.Collections;
import java.util.Vector;

// 제네릭 기능 사용하는 벡터
public class Vector02 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        vec.add("Apple");
        vec.add("Cherry");
        vec.add("Peach");

        System.out.println(vec.size());
        Collections.sort(vec); // 벡터에 저장된 문자열 정렬

        for (String c : vec) {
            System.out.println(c);
        }
    }
}
