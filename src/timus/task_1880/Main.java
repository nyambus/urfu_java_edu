package timus.task_1880;

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) set.add(in.nextInt());
        int n2 = in.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            int x = in.nextInt();
            if (set.contains(x)) set2.add(x);
        }
        int n3 = in.nextInt();
        int count = 0;
        for (int i = 0; i < n3; i++) {
            if (set2.contains(in.nextInt())) count++;
        }
        in.close();
        System.out.println(count);
    }
}
