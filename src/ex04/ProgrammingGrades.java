package ex04;

public class ProgrammingGrades {

    public static String grade(int score) {
        String unit = "";
        if (score >= 95) {
            return unit + "A+";
        } else if (score >= 90 && score <= 94) {
            return unit + "A0";
        } else if (score >= 80 && score < 90) {
            return unit + "B+";
        } else if (score >= 70 && score < 80) {
            return unit + "B0";
        } else {
        }
        return unit;
    }

    public static void main(String[] args) {
        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        System.out.printf("%d점 -> %s\n", score1, grade(score1));
        System.out.printf("%d점 -> %s\n", score2, grade(score2));
        System.out.printf("%d점 -> %s\n", score3, grade(score3));
    }
}
