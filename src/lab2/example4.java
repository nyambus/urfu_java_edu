package lab2;

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = in.nextInt();
        if (a >= 5 && a<= 10) {
            System.out.println("Число удовлетворяет условиям!");
        }
        else {
            System.out.println("Ошибка! Число не удовлетворяет условиям!");
        }
        in.close();
    }
}
