package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        int[] cost = new int[256];
        String[] keys = {"", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", ".,!"};
        for (int i = 1; i < keys.length; i++)
            for (int j = 0; j < keys[i].length(); j++)
                cost[keys[i].charAt(j)] = j + 1;
        cost[' '] = 1;
        int total = 0;
        for (char c : s.toCharArray()) total += cost[c];
        System.out.println(total);
    }
}
