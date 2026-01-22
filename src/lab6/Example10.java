package lab6;

public class Example10 {
    static int[] getMinMax(int ... nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return new int[] {max, min};
    }

    public static void main(String[] args) {
        int[] res1 = Example10.getMinMax(10, 50, 2, 99, 4);
        System.out.println("Max: " + res1[0] + ", Min: " + res1[1]);
        int[] arr = {-5, 0, 20, -10};
        int[] res2 = Example10.getMinMax(arr);
        System.out.println("Max: " + res2[0] + ", Min: " + res2[1]);
    }
}