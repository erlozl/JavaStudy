package tra;

class Test {
    int solution(int angle) {
        int answer = 0;
        boolean angleArea = (0 < angle) && (angle <= 180);
        System.out.println(angleArea);
        return answer;
        // if (0 < angle > 90) {
        // return angle = 1;
        // } else if (angle == 90) {
        // return angle = 2;
        // } else if (91 <= angle <= 179) {
        // return angle = 3;
        // } else if (angle == 180) {
        // return angle = 4;
        // }
        // return angle;
    }
}

public class Tra15 {
    public static void main(String[] args) {
        Test test = new Test();
        test.solution(5);

    }
}
