package lab12;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread t = new Thread(() -> {
                System.out.println("Номер потока: " + threadNumber);
            });
            t.start();
        }
    }
}
