package timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long ans = 0;
        if (n <= m) {
            ans = 2 * (n - 1);
        } else {
            ans = 2 * (m - 1) + 1;
        }
        System.out.println(ans);
    }
}
