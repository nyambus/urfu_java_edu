package lab2;

import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = in.nextInt();
        if ((a%3) == 0) {
            System.out.println("Число делится на 3!");
        }
        else {
            System.out.println("Ошибка! Число не делится на 3!");
        }
        in.close();
    }
}
