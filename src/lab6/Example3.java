package lab6;

public class Example3 {

    static void calcMax(int ... arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max val: " + max);
    }

    static void calcMin(int ... arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min val: " + min);
    }

    static void calcAvg(int ... arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("avg val: " + avg);
    }

    public static void main(String[] args) {
        System.out.println("NUMBERS");
        Example3.calcMax(10, 5, 20, 3);
        Example3.calcMin(10, 5, 20, 3);
        Example3.calcAvg(10, 5, 20, 3);
        System.out.println("ARRAY");
        int[] nums = {12, 44, 2, 8, 10};
        Example3.calcMax(nums);
        Example3.calcMin(nums);
        Example3.calcAvg(nums);
    }
}