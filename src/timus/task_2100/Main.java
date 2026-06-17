package timus.task_2100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int total = 2 + n;
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            if (s.contains("+one")) total++;
        }
        in.close();
        if (total == 13) total++;
        System.out.println(total * 100);
    }
}
