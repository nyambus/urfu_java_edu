package lab3;

public class example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];
        char currentChar = 'a';
        for (int i = 0; i < size; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }
}