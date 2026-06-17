package timus.task_1001;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        while (in.hasNextDouble()) {
            stack.push(Math.sqrt(in.nextDouble()));
        }
        in.close();
        while (!stack.isEmpty()) {
            System.out.printf("%.4f\n", stack.pop());
        }
    }
}
