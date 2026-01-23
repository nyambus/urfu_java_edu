package lab6;

public class Example9 {
    static void reverse(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char t = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = t;
        }
    }

    public static void main(String[] args) {
        char[] syms = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("before:");
        System.out.println(syms);
        Example9.reverse(syms);
        System.out.println("after:");
        System.out.println(syms);
    }
}
