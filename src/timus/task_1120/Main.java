package timus.task_1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLong()) {
            long s = in.nextLong();
            long maxN = (long) Math.sqrt(2 * s);
            for (long n = maxN; n >= 1; n--) {
                long top = 2 * s - n * n + n;
                long bot = 2 * n;
                if (top > 0 && top % bot == 0) {
                    long a = top / bot;
                    System.out.println(a + " " + n);
                    break;
                }
            }
        }
    }
}
