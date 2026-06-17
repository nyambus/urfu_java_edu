package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long k = in.nextLong() - 1;
            long d = (long) Math.sqrt(8 * k + 1);
            System.out.print(d * d == 8 * k + 1 ? "1 " : "0 ");
        }
        in.close();
    }
}
