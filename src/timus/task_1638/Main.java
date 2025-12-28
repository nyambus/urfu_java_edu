package timus.task_1638;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int c = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int full = t + 2 * c;
        int startPos = n1 * full - c;
        int endPos = (n2 - 1) * full + c;
        int res = Math.abs(endPos - startPos);
        System.out.println(res);
    }
}
