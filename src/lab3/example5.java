package lab3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int count = in.nextInt();
        int sum = 0;
        int start = 0;
        int num = 1;
        System.out.println("Суммируемые:");
        for (start = 0; start < count;) {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
                start++;
            }
            num++;
        }
        System.out.println(" ");
        System.out.println("Сумма: " + sum);
        in.close();
    }
}
