package ex13;

import java.util.Vector;

// 벡터 VectorClass
// 가변 크기의 배열 - 동기화 (앞의 순서가 있음)
// add(index, object), remove(),get() - 값 추출 , size() - 현재 벡터 요소의 개수 반환
public class Vector01 {
    public static void main(String[] args) {
        Vector vc = new Vector();

        vc.add("Hello World");
        vc.add(new Integer(10));
        // 원래 있던 클래스의 객체만 추가 가능
        // 해당 클래스가 이미 객체이기 때문에 new를 해도 넣을 수 있다
        vc.add(20);
        // 여러가지 타입 추가 가능

        System.out.println(vc.size());

        // for문 다른 방식으로 출력해보기
        // 주의해야 할 점은 vc 벡터의 요소는 모든 타입의 객체일 수 있기 때문에, Object 타입으로 요소를 받아야 한다
        // 따라서, 출력 시에는 각 요소의 타입에 맞게 형변환
        for (Object element : vc) {
            System.out.println(element);
            if (element instanceof String) {
                String str = (String) element;
                // String으로 처리하는 작업 수행
                System.out.println("String: " + str);
            } else if (element instanceof Integer) {
                Integer integer = (Integer) element;
                // Integer로 처리하는 작업 수행
                System.out.println("Integer: " + integer);
            } else {
                // 다른 타입에 대한 처리
            }
        }
        // instanceof 연산자를 사용하는 것은 벡터의 요소의 실제 타입을 확인하고 형변환하기 위해 일반적으로 사용되는 방법
        // Java에서 모든 객체에 대해 사용할 수 있는 연산자
        // instanceof 연산자는 주어진 객체가 특정 클래스의 인스턴스인지 또는 해당 클래스의 서브클래스의 인스턴스인지를 확인

        System.out.println();

        for (int i = 0; i < vc.size(); i++) {
            System.out.println(i + " " + vc.get(i));
        }

        // get()은 Object타입으로 반환하므로 형변환하여서 사용
        String s = (String) vc.get(0);
        Integer inte = (Integer) vc.get(1);
        System.out.println(s);
        System.out.println(inte);
        // System.out.println(vc.get()); 오류
        // get() 메소드를 호출할 때는 항상 인덱스를 지정해야 하고, 반환된 객체를 적절히 형변환하여 사용
    }
}
