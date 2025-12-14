package lab4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = i * 5 + j + 1;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int delRow = r.nextInt(5);
        int delCol = r.nextInt(5);
        int[][] b = new int[4][4];
        for (int i = 0, x = 0; i < 5; i++) {
            if (i == delRow) continue;
            for (int j = 0, y = 0; j < 5; j++) {
                if (j == delCol) continue;
                b[x][y] = a[i][j];
                y++;
            }
            x++;
        }
        System.out.println("\nБез строки " + delRow + " и столбца " + delCol);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
