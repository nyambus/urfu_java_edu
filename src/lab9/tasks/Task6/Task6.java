package lab9.tasks.Task6;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");

        System.out.println("Ключ больше 5:");
        for (Integer k : map.keySet()) {
            if (k > 5) {
                System.out.println(map.get(k));
            }
        }

        if (map.containsKey(0)) {
            System.out.println("\nВсе строки через запятую:");
            for (String s : map.values()) {
                System.out.print(s + ", ");
            }
            System.out.println();
        }

        int m = 1;
        for (Integer k : map.keySet()) {
            String s = map.get(k);
            if (s.length() > 5) {
                m = m * k;
            }
        }
        System.out.println("\nРезультат умножения ключей: " + m);
    }
}
