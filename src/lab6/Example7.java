package lab6;

public class Example7 {

    static int[] convert(char[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = (int) arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        char[] syms = {'A', 'B', 'C', 'a', 'z'};
        int[] codes = Example7.convert(syms);
        for (int i = 0; i < codes.length; i++) {
            System.out.println(syms[i] + " -> " + codes[i]);
        }
    }
}