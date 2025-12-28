package lab5;

public class Example1 {
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.set('A');
        int code = t.getCode();
        System.out.println("Код символа: " + code);
        t.print();
    }
}

class Task1 {
    private char ch;
    public void set(char symbol) {
        ch = symbol;
    }
    public int getCode() {
        return (int) ch;
    }
    public void print() {
        System.out.println("Символ: " + ch);
        System.out.println("Код: " + (int) ch);
    }
}
