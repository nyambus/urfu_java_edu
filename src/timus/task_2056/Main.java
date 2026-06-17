package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean hasThree = false;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int g = in.nextInt();
            if (g == 3) hasThree = true;
            sum += g;
        }
        in.close();
        if (hasThree) System.out.println("None");
        else if (sum == 5 * n) System.out.println("Named");
        else if ((double) sum / n >= 4.5) System.out.println("High");
        else System.out.println("Common");
    }
}
