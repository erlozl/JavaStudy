package tra;

class Mymethod {
    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    int add(int x, int y, int z, int w) {
        return x + y + z + w;
    }
}

public class Tra16 {
    public static void main(String[] args) {
        Mymethod math = new Mymethod();
        int result = math.add(1, 3);
        int result1 = math.add(1, 3, 5);
        int result2 = math.add(1, 3, 5, 7);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
