package lab6;

public class Example6 {
    static int[] get_copy(int[] arr, int n) {
        if (n > arr.length) {
            n = arr.length;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.out.print("take 3: ");
        int[] r1 = Example6.get_copy(data, 3);
        for (int x : r1) System.out.print(x + " ");
        System.out.println();
        System.out.print("take 10: ");
        int[] r2 = Example6.get_copy(data, 10);
        for (int x : r2) System.out.print(x + " ");
        System.out.println();
    }
}
