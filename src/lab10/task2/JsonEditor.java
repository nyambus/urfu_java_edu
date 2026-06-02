package lab10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonEditor {
    private static final String FILE_PATH = "src/lab10/task1/songs.json";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in, "UTF-8");
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray songs = (JSONArray) root.get("songs");

            System.out.println("Введите название песни для добавления:");
            String title = scanner.nextLine();
            System.out.println("Введите исполнителя:");
            String artist = scanner.nextLine();
            System.out.println("Введите год выпуска:");
            int year = Integer.parseInt(scanner.nextLine());

            JSONObject newSong = new JSONObject();
            newSong.put("title", title);
            newSong.put("artist", artist);
            newSong.put("year", year);
            songs.add(newSong);
            saveJson(root);
            System.out.println("Песня добавлена!");

            System.out.println("\nВведите исполнителя для поиска:");
            String searchArtist = scanner.nextLine();
            System.out.println("Результаты поиска:");
            for (Object o : songs) {
                JSONObject song = (JSONObject) o;
                if (song.get("artist").toString().equalsIgnoreCase(searchArtist)) {
                    System.out.println("  " + song.get("title") + " (" + song.get("year") + ")");
                }
            }

            System.out.println("\nВведите название песни для удаления:");
            String delTitle = scanner.nextLine();
            Iterator iterator = songs.iterator();
            while (iterator.hasNext()) {
                JSONObject song = (JSONObject) iterator.next();
                if (song.get("title").toString().equalsIgnoreCase(delTitle)) {
                    iterator.remove();
                    System.out.println("Песня удалена.");
                }
            }
            saveJson(root);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void saveJson(JSONObject root) throws Exception {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(root.toJSONString());
        }
    }
}
