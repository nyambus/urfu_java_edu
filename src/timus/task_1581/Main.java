package timus.task_1581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        in.close();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            int count = 1;
            while (i + count < n && a[i + count] == a[i]) count++;
            sb.append(count).append(' ').append(a[i]).append(' ');
            i += count;
        }
        System.out.println(sb.toString().trim());
    }
}
