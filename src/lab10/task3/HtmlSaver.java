package lab10.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlSaver {
    private static final String URL = "http://fat.urfu.ru/index.html";
    private static final String OUTPUT_FILE = "src/lab10/task3/news.txt";
    private static final int MAX_RETRIES = 3;

    public static void main(String[] args) {
        Document doc = null;

        for (int attempt = 1; attempt <= MAX_RETRIES; attempt++) {
            try {
                doc = Jsoup.connect(URL).get();
                break;
            } catch (IOException e) {
                System.out.println("Попытка " + attempt + " не удалась: " + e.getMessage());
                if (attempt == MAX_RETRIES) {
                    System.out.println("Не удалось подключиться к сайту после " + MAX_RETRIES + " попыток.");
                    return;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                }
            }
        }

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            Elements newsParent = doc.select(
                "#one_col > div > div.tt_h > div.post_content > div"
            );
            for (int i = 0; i < newsParent.size(); i++) {
                if (i % 2 == 0) {
                    String date = ((Element) newsParent.get(i + 1))
                        .getElementsByClass("blockdate").get(0).text();
                    String topic = ((Element) newsParent.get(i + 1))
                        .getElementsByClass("blocktitle").get(0).text();
                    String line = "Тема: " + topic + " | Дата: " + date;
                    System.out.println(line);
                    writer.write(line + "\n");
                }
            }
            System.out.println("\nДанные сохранены в " + OUTPUT_FILE);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка при парсинге: " + e.getMessage());
        }
    }
}
