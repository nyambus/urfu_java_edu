package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a = 1;
        long b = 1;
        long c = 1;
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println(2 * c);
    }
}
