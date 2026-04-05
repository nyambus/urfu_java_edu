package lab10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc.select("#one_col > div > div.tt_h > div.post_content > div");
            for (int i = 0; i < newsParent.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println("Тема: " +
                            ((Element) newsParent.get(i + 1)).getElementsByClass("blockdate").get(0).text());
                    System.out.println("Дата: " +
                            ((Element) newsParent.get(i + 1)).getElementsByClass("blocktitle").get(0).text());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}