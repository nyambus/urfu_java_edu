package lab3;

import java.util.Arrays;
import java.util.Random;

public class example10 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random rand = new Random();
        System.out.println("До сортировки:");
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100);
            System.out.print(num[i] + " ");
        }
        Arrays.sort(num);
        int[] reversed = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            reversed[i] = num[num.length - 1 - i];
        }
        num = reversed;
        System.out.println(" ");
        System.out.println("После сортировки:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}