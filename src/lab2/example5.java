package lab2;

import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = in.nextInt();
        int thousands = a / 1000;
        System.out.println(thousands);
        in.close();
    }
}
