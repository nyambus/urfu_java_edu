package lab3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи, которое нужно вывести: ");
        int n = in.nextInt();
        in.close();
        if (n <= 0) {
            System.out.println("Количество чисел должно быть положительным.");
            return;
        }
        int a = 1;
        int b = 1;
        System.out.println("\nПоследовательность Фибоначчи:");
        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(", " + b);
        }
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}