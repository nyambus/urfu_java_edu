package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month name: ");
        String month = in.nextLine();

        System.out.println("Input number of days in a month: ");
        String number = in.nextLine();

        System.out.println("There are " + number + " " + "days in " + month);
        in.close();
    }
}
