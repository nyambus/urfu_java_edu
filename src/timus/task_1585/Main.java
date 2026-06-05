package timus.task_1585;

import java.util.Scanner;

public class Main {
    // 123
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int e = 0, m = 0, l = 0;
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            if (s.startsWith("E")) e++;
            else if (s.startsWith("M")) m++;
            else l++;
        }
        in.close();
        if (e > m && e > l) System.out.println("Emperor Penguin");
        else if (m > l) System.out.println("Macaroni Penguin");
        else System.out.println("Little Penguin");
    }
}
