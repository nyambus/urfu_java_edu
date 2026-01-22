package timus.task_2111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }
            System.out.println(sum * sum);
        }
        scanner.close();
    }
}

