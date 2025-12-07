package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int rest = 12 - f;
        int need = rest * 45;
        int left = 240;
        if (need <= left) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}
