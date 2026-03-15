package lab9.tasks.Task7;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int pos = 0;
        while (list.size() > 1) {
            pos = (pos + 1) % list.size();
            list.remove(pos);
        }
        System.out.println("Остался человек №: " + list.get(0));
    }
}
