package timus.task_1319;

import java.util.Scanner;

public class Main {
    // 123
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int[][] a = new int[n][n];
        int num = 1;
        for (int d = n - 1; d >= 0; d--)
            for (int i = 0, j = d; i < n && j < n; i++, j++)
                a[i][j] = num++;
        for (int d = 1; d < n; d++)
            for (int i = d, j = 0; i < n && j < n; i++, j++)
                a[i][j] = num++;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
