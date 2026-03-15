package lab9.tasks.Task3;

import java.util.Scanner;

public class Task3 {
    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Массив, выведенный рекурсией: ");
        printArray(nums, 0);
        System.out.println();
        in.close();
    }
}
