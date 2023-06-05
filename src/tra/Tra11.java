package tra;

// 극장안의 관객 수 세기
public class Tra11 {
    public static void main(String[] args) {
        int[][] peoples = {
                { 0, 0, 0, 1, 1, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0, 1 },
        };

        int count = 0;
        for (int i = 0; i < peoples.length; i++) {
            // 행
            for (int j = 0; j < peoples[i].length; j++) {
                // 열
                count += peoples[i][j];
                // 끝
            }
        }
        System.out.println(count);

    }
}
