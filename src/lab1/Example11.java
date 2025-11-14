package lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int birth = in.nextInt();

        int age = 2025 - birth;
        System.out.println("Your name is " + name + " " + "you are" + " " + age + " " + "years old");
        in.close();
    }
}
