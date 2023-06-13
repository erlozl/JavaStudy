package tra;

class MyDate1 {
    private int year, month, date;

    public MyDate1(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public String toString() {
        return "MyDate1 [year=" + year + ",month=" + month + ", MyDate1 " + date + "]";
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }
}

class Employee1 {
    private String name;
    private MyDate1 birthDate;
    // 합성을 하는 것이기 때문에 클래스 이름만 들고오면 변수,메서드 사용 가능
    // 변수 임의로 지정 가능

    public Employee1(String name, MyDate1 birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Employee1 [name=" + name + ",birthDate=" + birthDate + "]";
    }

    public String getName() {
        return name;
    }

    public MyDate1 getBirthDate() {
        return birthDate;
    }
}

public class mini03 {
    public static void main(String[] args) {
        MyDate1 birth = new MyDate1(1994, 01, 21);
        Employee1 employee1 = new Employee1("이언지", birth);
        // System.out.println(employee1);
        // System.out.println(employee1.getBirthDate());

    }
}
