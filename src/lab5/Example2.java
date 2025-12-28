package lab5;

public class Example2 {
    public static void main(String[] args) {
        Task2 t = new Task2();
        t.a = 'A';
        t.b = 'Z';
        t.printRange();
    }
}

class Task2 {
    char a;
    char b;
    public String printRange() {
        String s = "";
        if (a > b) {
            char temp = a;
            a = b;
            b = temp;
        }
        for (char i = a; i <= b; i++) {
            System.out.print(i + " ");
            s = s + i + " ";
        }
        System.out.println();
        return s;
    }
}
