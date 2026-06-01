package lab13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task2_3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int n = in.nextInt();
            byte[] arr = new byte[n];
            int sum = 0;

            System.out.println("Введите " + n + " элементов типа byte:");
            for (int i = 0; i < n; i++) {
                int val = in.nextInt();
                if (val < Byte.MIN_VALUE || val > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException(
                        "Значение " + val + " за границами диапазона типа byte"
                    );
                }
                arr[i] = (byte) val;
                sum += arr[i];
            }

            System.out.println("Сумма элементов: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
