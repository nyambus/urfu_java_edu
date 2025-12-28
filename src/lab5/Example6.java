package lab5;

public class Example6 {
    public static void main(String[] args) {
        Task6 t = new Task6(10, 50);
        t.print();
        t.set(100, 5);
        t.print();
        t.set(200);
        t.print();
    }
}

class Task6 {
    private int min;
    private int max;
    Task6(int x, int y) {
        set(x, y);
    }
    Task6(int x) {
        set(x);
    }
    public void set(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }
    public void set(int x) {
        if (x > max) {
            max = x;
        }
        if (x < min) {
            min = x;
        }
    }
    void print() {
        System.out.println("Мин: " + min + " Макс: " + max);
    }
}
