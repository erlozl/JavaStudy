package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map은 키-값을 하나의 쌍으로 묶어서 저장하는 자료구조
// 데이터를 저장하려면 put()메서드를 사용
// 값 추출하려면 get()메서드를 사용
// 동일한 키로 두 개의 값 저장 X

public class MapEx01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Iterator<String> it = map.keySet().iterator();
        // Iterator를 사용하면 집합의 요소들을 순회하며 접근

        while (it.hasNext()) {
            // 순회할 요소가 남아 있는지 여부를 확인
            String key = it.next();
            // 다음 요소를 가져
            System.out.println("key" + key + ", value = " + map.get(key));
        }
        // 키에 대해 반복하면서 각 키와 해당 값에 접근하고 출력하는 예제

        map.put("3", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee")); // 키를 가지고 값을 참조한다

        // keySet은 키들의 집합을 반환한다
        for (String e : map.keySet()) {
            String value = map.get(e);
            System.out.println("key = " + e + ", value = " + value);
        }
        map.remove("3");
        System.out.println(map);
        map.put("choi", "password");
        System.out.println(map);
    }
}
