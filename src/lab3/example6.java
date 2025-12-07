package lab3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        if (in.hasNextInt()) {
            int size = in.nextInt();
            if (size > 0) {
                int[] array = new int[size];
                int number = 2;
                for (int i = 0; i < array.length; i++) {
                    array[i] = number;
                    number = number + 5;
                }
                System.out.println("Массив:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            } else {
                System.out.println("Ошибка! Размер должен быть больше 0.");
            }
        } else {
            System.out.println("Ошибка! Нужно ввести число.");
        }
        in.close();
    }
}
