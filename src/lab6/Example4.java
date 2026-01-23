package lab6;

public class Example4 {
    static int fact(int n) {
        int res = 1;
        for (int i = n; i > 0; i -= 2) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("6!! = " + Example4.fact(6));
        System.out.println("5!! = " + Example4.fact(5));
    }
}
