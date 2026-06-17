package timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 1, steps = 0;
        for (int i = 0; i < n; i++) {
            String s = in.next();
            int target;
            char c = s.charAt(0);
            if (c == 'A' || c == 'P' || c == 'O' || c == 'R') target = 1;
            else if (c == 'B' || c == 'M' || c == 'S') target = 2;
            else target = 3;
            steps += Math.abs(pos - target);
            pos = target;
        }
        in.close();
        System.out.println(steps);
    }
}
