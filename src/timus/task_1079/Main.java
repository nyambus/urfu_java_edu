package timus.task_1079;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            int[] a = new int[n + 1];
            a[0] = 0;
            a[1] = 1;
            int max = 1;
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    a[i] = a[i / 2];
                } else {
                    a[i] = a[i / 2] + a[i / 2 + 1];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(max);
        }
    }
}
