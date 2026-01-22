package lab6;

public class Example1 {
    char c;
    String text;

    void set(char val) {
        c = val;
        System.out.println("char is: " + c);
    }

    void set(String val) {
        text = val;
        System.out.println("text is: " + text);
    }

    void set(char[] arr) {
        if (arr.length == 1) {
            c = arr[0];
            System.out.println("array to char: " + c);
        } else {
            text = new String(arr);
            System.out.println("array to text: " + text);
        }
    }

    public static void main(String[] args) {
        Example1 t = new Example1();
        t.set('K');
        t.set("Java code");
        char[] a1 = {'Z'};
        t.set(a1);
        char[] a2 = {'H', 'e', 'l', 'l', 'o'};
        t.set(a2);
    }
}