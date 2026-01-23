package timus.task_1180;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNext()) {
            String nStr = in.next();
            int sum = 0;
            for (int i = 0; i < nStr.length(); i++) {
                sum += nStr.charAt(i) - '0';
            }
            int remainder = sum % 3;
            if (remainder == 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
                System.out.println(remainder);
            }
        }
    }
}

