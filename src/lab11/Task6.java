package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 20, 25, 30);
        List<Integer> result = filterDivisible(list, 10);
        System.out.println(result);
    }

    public static List<Integer> filterDivisible(List<Integer> list, int divider) {
        return list.stream()
                .filter(x -> x % divider == 0)
                .collect(Collectors.toList());
    }
}
