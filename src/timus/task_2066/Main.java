package timus.task_2066;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        int[] results = {a + b + c, a + b - c, a + b * c, a - b + c, a - b - c, a - b * c, a * b + c, a * b - c, a * b * c};
        int min = results[0];
        for (int i = 1; i < results.length; i++) {
            if (results[i] < min) {
                min = results[i];
            }
        }
        System.out.println(min);
    }
}