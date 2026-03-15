package lab9.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        int n = 1000000;

        System.out.println("\nДобавление");
        System.out.println("ArrayList в начало: " + getAddTime(new ArrayList<>(), 50000, "start"));
        System.out.println("ArrayList в середину: " + getAddTime(new ArrayList<>(), 50000, "mid"));
        System.out.println("ArrayList в конец: " + getAddTime(arrayList, n, "end"));
        System.out.println("HashSet в конец: " + getAddSetTime(hashSet, n));
        System.out.println("TreeMap в конец: " + getAddMapTime(treeMap, n));

        System.out.println("\nУдаление");
        System.out.println("ArrayList из начала: " + getRemTime(arrayList, "start"));
        System.out.println("ArrayList из середины: " + getRemTime(arrayList, "mid"));
        System.out.println("ArrayList из конца: " + getRemTime(arrayList, "end"));
        System.out.println("HashSet удаление: " + getRemSetTime(hashSet, 10000));
        System.out.println("TreeMap удаление: " + getRemMapTime(treeMap, 10000));

        System.out.println("\nПолучение");
        System.out.println("ArrayList get по индексу: " + getGetTime(arrayList, 10000));
    }

    private static long getAddTime(List<Integer> list, int count, String pos) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            if (pos.equals("start")) list.add(0, i);
            else if (pos.equals("mid")) list.add(list.size() / 2, i);
            else list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddSetTime(Set<Integer> set, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) set.add(i);
        return System.currentTimeMillis() - start;
    }

    private static long getAddMapTime(Map<Integer, Integer> map, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) map.put(i, i);
        return System.currentTimeMillis() - start;
    }

    private static long getRemTime(List<Integer> list, String pos) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (pos.equals("start")) list.remove(0);
            else if (pos.equals("mid")) list.remove(list.size() / 2);
            else list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemSetTime(Set<Integer> set, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) set.remove(i);
        return System.currentTimeMillis() - start;
    }

    private static long getRemMapTime(Map<Integer, Integer> map, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) map.remove(i);
        return System.currentTimeMillis() - start;
    }

    private static long getGetTime(List<Integer> list, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) list.get(i);
        return System.currentTimeMillis() - start;
    }
}