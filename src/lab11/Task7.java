package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "abc", "abcd", "abcde");
        List<String> result = filterByLength(list, 3);
        System.out.println(result);
    }

    public static List<String> filterByLength(List<String> list, int len) {
        return list.stream()
                .filter(s -> s.length() > len)
                .collect(Collectors.toList());
    }
}
