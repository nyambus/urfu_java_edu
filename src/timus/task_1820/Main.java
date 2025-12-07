package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int totalSides = 2 * n;
        if (n <= k) {
            System.out.println(2);
        } else {
            int minutes = (totalSides + k - 1) / k;
            System.out.println(minutes);
        }
        in.close();
    }
}
