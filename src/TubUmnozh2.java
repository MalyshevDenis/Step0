public class TubUmnozh2 {
    public static void main(String[] args) {
        int[][] tub = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tub[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", tub[i][j]);
            }
            System.out.println();
        }
    }

}
