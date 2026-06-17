package timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        in.close();
        for (int d = 0; d < 2 * n - 1; d++) {
            for (int i = 0; i <= d; i++) {
                int j = d - i;
                if (i < n && j < n && j >= 0)
                    System.out.print(a[i][j] + " ");
            }
        }
    }
}
