package lab9.tasks.Task2;

import java.util.Scanner;

public class Task2 {
    public static void binary(int n) {
        if (n > 1) {
            binary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input: ");
        if (in.hasNextInt()) {
            int number = in.nextInt();
            System.out.print("binary: ");
            if (number == 0) {
                System.out.print(0);
            } else {
                binary(number);
            }
            System.out.println();
        }
        in.close();
    }
}
