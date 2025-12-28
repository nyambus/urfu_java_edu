package lab5;

public class Example4 {
    public static void main(String[] args) {
        Task4 t1 = new Task4(65.1267);
        t1.print();
        Task4 t2 = new Task4(50, 'Z');
        t2.print();
    }
}

class Task4 {
    char c;
    int i;
    Task4(int n, char s) {
        i = n;
        c = s;
    }
    Task4(double x) {
        int code = (int) x;
        c = (char) code;

        double ostatok = x - code;
        i = (int) (ostatok * 100);
    }
    void print() {
        System.out.println("Символ: " + c);
        System.out.println("Код: " + i);
    }
}
