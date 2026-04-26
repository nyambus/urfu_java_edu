package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = List.of("java", "javascript", "python", "kotlin");
        List<String> result = filterBySubstring(list, "java");
        System.out.println(result);
    }

    public static List<String> filterBySubstring(List<String> list, String sub) {
        return list.stream()
                .filter(s -> s.contains(sub))
                .collect(Collectors.toList());
    }
}
