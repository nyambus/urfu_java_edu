package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> result = squareList(list);
        System.out.println(result);
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
