package timus.task_1510;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            int candidate = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if (count == 0) {
                    candidate = num;
                    count = 1;
                } else if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
            System.out.println(candidate);
        }
    }
}

