package lab4;

public class example7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] a = new int[n][m];
        int value = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = value++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    a[i][j] = value++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
