package lab6;

public class Example8 {
    static double avg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        double res = Example8.avg(nums);
        System.out.println("average: " + res);
    }
}
