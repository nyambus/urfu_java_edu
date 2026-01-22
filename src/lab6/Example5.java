package lab6;

public class Example5 {
    static int calc(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int val = Example5.calc(n);
        System.out.println("loop res: " + val);
        int form = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("formula check: " + form);
    }
}