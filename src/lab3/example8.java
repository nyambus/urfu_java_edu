package lab3;

public class example8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char current = 'A';
        int found = 0;
        while (found < 10) {
            if (current == 'A' || current == 'E' || current == 'I' ||
                    current == 'O' || current == 'U') {
                current++;
                continue;
            }
            letters[found] = current;
            found++;
            current++;
        }
        System.out.println("Согласные буквы:");
        for (int i = 0; i < 10; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}
