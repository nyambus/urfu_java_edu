package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input age: ");
        int age = in.nextInt();

        int year = 2025 - age;
        System.out.println("Your year of birth: " + year);
        in.close();
    }
}
