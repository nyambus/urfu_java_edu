package timus.task_1910;

import java.util.Scanner;

public class Main {
    // 123
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        in.close();
        int maxSum = 0, mid = 1;
        for (int i = 1; i < n - 1; i++) {
            int sum = a[i-1] + a[i] + a[i+1];
            if (sum > maxSum) { maxSum = sum; mid = i; }
        }
        System.out.println(maxSum + " " + (mid + 1));
    }
}
