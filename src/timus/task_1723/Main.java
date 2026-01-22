package timus.task_1723;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String res = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int count = 0;

                for (int k = 0; k <= s.length() - sub.length(); k++) {
                    String temp = s.substring(k, k + sub.length());
                    if (temp.equals(sub)) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                    res = sub;
                }
                else if (count == max) {
                    if (sub.length() > res.length()) {
                        res = sub;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
