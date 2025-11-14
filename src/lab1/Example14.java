package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();

        int prev = num - 1;
        int next = num + 1;
        int sq = (prev + num + next) * (prev + num + next);

        System.out.println(prev + " " + num + " " + next + " " + sq);
        in.close();
    }
}
