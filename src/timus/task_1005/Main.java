package timus.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
            }
            System.out.println(check(0, 0, w));
        }
    }
    public static int check(int i, int sum1, int[] w) {
        if (i == w.length) {
            int sum2 = 0;
            for (int k = 0; k < w.length; k++) {
                sum2 += w[k];
            }
            sum2 -= sum1;
            return Math.abs(sum1 - sum2);
        }
        int res1 = check(i + 1, sum1 + w[i], w);
        int res2 = check(i + 1, sum1, w);
        return Math.min(res1, res2);
    }
}
