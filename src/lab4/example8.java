package lab4;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();
        System.out.println("Введите ключ (число):");
        int key = in.nextInt();
        in.nextLine();
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c + key);
                if (c > 'z') {
                    c = (char) (c - 26);
                }
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + key);
                if (c > 'Z') {
                    c = (char) (c - 26);
                }
            }
            encrypted = encrypted + c;
        }
        System.out.println("Текст после преобразования: " + encrypted);
        boolean askAgain = true;
        while (askAgain) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine();
            if (answer.equals("y")) {
                String decrypted = "";
                for (int i = 0; i < encrypted.length(); i++) {
                    char c = encrypted.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        c = (char) (c - key);
                        if (c < 'a') {
                            c = (char) (c + 26);
                        }
                    } else if (c >= 'A' && c <= 'Z') {
                        c = (char) (c - key);
                        if (c < 'A') {
                            c = (char) (c + 26);
                        }
                    }
                    decrypted = decrypted + c;
                }
                System.out.println("Расшифрованный текст: " + decrypted);
                askAgain = false;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                askAgain = false;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
        in.close();
    }
}