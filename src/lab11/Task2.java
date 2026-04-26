package lab11;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] result = findCommonElements(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x))
                .toArray();
    }
}
