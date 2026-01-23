package timus.task_1260;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 1 || n == 2) {
                System.out.println(1);
                return;
            }
            if (n == 3) {
                System.out.println(2);
                return;
            }
            long[] dp = new long[n + 1];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 2;
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 3] + 1;
            }
            System.out.println(dp[n]);
        }
    }
}

