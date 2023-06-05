package ex04;

class Volume {
    int width;
    int length;
    int height;

    double getVolume() {
        return (double) width * length * height;
    }
}

public class Box {
    public static void main(String[] args) {
        Volume boxVolume = new Volume();
        boxVolume.width = 20;
        boxVolume.length = 20;
        boxVolume.height = 30;

        System.out.println(boxVolume.getVolume());
        // 12000.0

    }
}
