package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        in.close();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
