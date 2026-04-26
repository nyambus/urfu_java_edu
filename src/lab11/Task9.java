package lab11;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Java123", "Stream", "2024");
        List<String> result = filterLettersOnly(list);
        System.out.println(result);
    }

    public static List<String> filterLettersOnly(List<String> list) {
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
