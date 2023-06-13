package tra;

// public String toString() { // toString은 생략 가능한 메서드

// 모든 클래스는 자동으로 Object 클래스를 상속받으며, Object 클래스에는 toString() 메서드가 정의

class Person {
    String name;

    // 매개변수가 없는 기본 생성자를 추가하는 이유는 클래스에 초기화 로직이 필요한 경우,
    // 또는 매개변수가 있는 다른 생성자와 함께 사용할 때 유용
    public Person() {
    };

    public Person(String theName) {
        this.name = theName;
    }

    public String getString() {
        return "Person [name=" + name + "]";
    }
}

class Employee extends Person {
    String id;

    public Employee() {
        super();
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public String getString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class Tra17 {
    public static void main(String[] args) {
        Person p = new Person("John");
        Employee e = new Employee("Kim", "20210001");
        Person d = new Employee("Lee", "199401");

        System.out.println(p.getString()); // 호출 시 부모 클래스의 getString() 메서드 호출
        System.out.println(e.getString()); // 호출 시 자식 클래스에서 오버라이딩한 getString() 메서드 호출

        System.out.println(d.getString()); // 호출 시 자식 클래스에서 오버라이딩한 getString() 메서드 호출
    }
}
