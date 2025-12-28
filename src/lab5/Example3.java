package lab5;

public class Example3 {
    public static void main(String[] args) {
        Task3 obj1 = new Task3();
        obj1.print();

        Task3 obj2 = new Task3(100);
        obj2.print();

        Task3 obj3 = new Task3(10, 20);
        obj3.print();
    }
}

class Task3 {
    int x;
    int y;
    Task3() {
        x = 0;
        y = 0;
    }
    Task3(int num) {
        x = num;
        y = 0;
    }
    Task3(int num1, int num2) {
        x = num1;
        y = num2;
    }
    void print() {
        System.out.println(x + " " + y);
    }
}
