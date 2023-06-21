package ex13;

import java.util.HashSet;
// LinkedHashedSet = 입력되는 순서대로 출력
// TreeSet = 알파멧 순서대로 정렬

// 집합 set 
// 데이터의 중복을 막도로 설계되어 있다
public class SetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);
        // Ham, Butter, Cheese, Milk, Bread
        // 순서일정하지 않음

        if (set.contains("Ham")) {
            System.out.println("햄 포함한다");
        }
    }
}
