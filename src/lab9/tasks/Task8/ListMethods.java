package lab9.tasks.Task8;

public class ListMethods {
    private Node head;

    public void createHead(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
    }

    public void createTail(int[] values) {
        if (values.length == 0) return;
        head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
    }

    public String toString() {
        String result = "";
        Node temp = head;
        while (temp != null) {
            result += temp.value + " ";
            temp = temp.next;
        }
        return result;
    }

    public void AddFirst(int value) {
        head = new Node(value, head);
    }

    public void AddLast(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void Insert(int value, int index) {
        if (index == 0) {
            AddFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = new Node(value, temp.next);
        }
    }

    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void RemoveLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void Remove(int index) {
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void createHeadRec(int[] values, int i) {
        if (i < 0) return;
        head = new Node(values[i], head);
        createHeadRec(values, i - 1);
    }

    public void createTailRec(int[] values, int i, Node tail) {
        if (i >= values.length) return;
        tail.next = new Node(values[i], null);
        createTailRec(values, i + 1, tail.next);
    }

    public String toStringRec(Node temp) {
        if (temp == null) return "";
        return temp.value + " " + toStringRec(temp.next);
    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        ListMethods list = new ListMethods();
        int[] data = {1, 2, 3};
        list.createHead(data);
        System.out.println("Создали список: " + list.toString());
        list.AddLast(10);
        list.Insert(55, 2);
        System.out.println("Добавили 10 в конец и 55 по индексу 2: " + list.toString());
        list.Remove(2);
        System.out.println("Удалили элемент под номером 2: " + list.toString());
        System.out.print("Вывод через рекурсию: ");
        System.out.println(list.toStringRec(list.getHead()));
    }
}