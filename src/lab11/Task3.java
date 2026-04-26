package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "banana", "Cherry", "date");
        List<String> result = filterCapitalized(list);
        System.out.println(result);
    }

    public static List<String> filterCapitalized(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
