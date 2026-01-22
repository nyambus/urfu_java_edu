package timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = n * (n + 1) / 2;
            if (sum % 2 == 0) {
                System.out.println("black");
            } else {
                System.out.println("grimy");
            }
        }
        scanner.close();
    }
}
