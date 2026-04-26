package lab11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = filterEvenNumbers(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}
