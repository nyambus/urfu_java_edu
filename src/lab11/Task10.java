package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 10, 15, 20, 25);
        List<Integer> result = filterLess(list, 15);
        System.out.println(result);
    }

    public static List<Integer> filterLess(List<Integer> list, int val) {
        return list.stream()
                .filter(x -> x < val)
                .collect(Collectors.toList());
    }
}
