package lab13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task2_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("Введите " + n + " элементов:");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int sum = 0;
            int count = 0;
            for (int v : arr) {
                if (v > 0) {
                    sum += v;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }

            System.out.println("Среднее положительных: " + (double) sum / count);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа или несоответствие числового типа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
