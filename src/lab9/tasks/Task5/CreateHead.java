package lab9.tasks.Task5;

public class CreateHead {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 5; i >= 1; i--) {
            head = new Node(i, head);
        }
        System.out.println("Список с головы создан");
    }
}