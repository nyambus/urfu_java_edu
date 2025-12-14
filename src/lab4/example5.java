package lab4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int r = 3;
        int c = 5;
        int[][] arr1 = new int[r][c];
        Random rand = new Random();
        System.out.println("Начальный массив:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = rand.nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("\nПосле замены:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
