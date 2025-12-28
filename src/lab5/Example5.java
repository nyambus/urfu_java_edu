package lab5;

public class Example5 {
    public static void main(String[] args) {
        Task5 t1 = new Task5(150);
        t1.print();
        Task5 t2 = new Task5();
        t2.print();
        t2.set(55);
        t2.print();
        t2.set(200);
        t2.print();
        t2.set();
        t2.print();
    }
}

class Task5 {
    private int val;
    Task5() {
        set();
    }
    Task5(int x) {
        set(x);
    }
    public void set() {
        val = 0;
    }
    public void set(int x) {
        if (x > 100) {
            val = 100;
        } else {
            val = x;
        }
    }
    public int getVal() {
        return val;
    }
    void print() {
        System.out.println("Значение: " + val);
    }
}
