package lab13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task2_2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            System.out.println("Матрица:");
            for (int[] row : matrix) {
                for (int v : row) {
                    System.out.print(v + "\t");
                }
                System.out.println();
            }

            System.out.print("Введите номер столбца: ");
            int col = in.nextInt();

            if (col < 0 || col >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с номером " + col);
            }

            System.out.print("Столбец " + col + ": ");
            for (int[] row : matrix) {
                System.out.print(row[col] + " ");
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
