package lab9.tasks.Task1;

public class Example5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Последовательность обхода дерева для n = " + n + ":");
        int result = f(n);
        System.out.println("Результат: " + result);
    }

    public static int f(int n) {
        System.out.println("Вызов f(" + n + ")");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }


}