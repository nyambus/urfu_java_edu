package lab9.tasks.Task5;

public class CreateTail {
    public static void main(String[] args) {
        Node head = new Node(1, null);
        Node tail = head;
        for (int i = 2; i <= 5; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }
        System.out.println("Список с хвоста создан");
    }
}