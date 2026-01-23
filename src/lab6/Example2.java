package lab6;

public class Example2 {
    private static int num = 0;
    static void show() {
        System.out.println("val: " + num);
        num++;
    }

    public static void main(String[] args) {
        Example2.show();
        Example2.show();
        Example2.show();
    }
}
