package tra;

public class Tra12 {
    public static void main(String[] args) {
        int[][] rag = new int[3][];
        rag[0] = new int[1];
        rag[1] = new int[2];
        rag[2] = new int[3];

        for (int r = 0; r < rag.length; r++) {
            for (int c = 0; c < rag[r].length; c++) {
                rag[r][c] = c;
                System.out.println(rag[r][c] = c);
            }
        }
    }
}
