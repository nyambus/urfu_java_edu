package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int queue = 0;
        for (int i = 0; i < n; i++) {
            queue += in.nextInt();
            queue = Math.max(0, queue - k);
        }
        in.close();
        System.out.println(queue);
    }
}
