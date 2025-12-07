package lab3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел последовательности Фибоначчи: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Количество должно быть положительным числом!");
            return;
        }
        System.out.println("Последовательность Фибоначчи:");
        int a = 1;
        int b = 1;
        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(" " + b);
        }
        if (n >= 3) {
            int i = 3;
            do {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
                i++;
            } while (i <= n);
        }
        System.out.println();
        in.close();
    }
}

