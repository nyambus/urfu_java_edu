package lab10.task1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XmlEditor {
    private static final String FILE_PATH = "src/lab10/task1/songs.xml";

    public static void main(String[] args) {
        try {
            File inputFile = new File(FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc;

            if (!inputFile.exists()) {
                doc = dBuilder.newDocument();
                Element root = doc.createElement("playlist");
                doc.appendChild(root);
            } else {
                doc = dBuilder.parse(inputFile);
            }
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in, "UTF-8");

            System.out.println("Введите название песни:");
            String title = scanner.nextLine();
            System.out.println("Введите исполнителя:");
            String artist = scanner.nextLine();
            System.out.println("Введите год выпуска:");
            String year = scanner.nextLine();

            Element root = doc.getDocumentElement();
            Element newSong = doc.createElement("song");
            newSong.appendChild(createElement(doc, "title", title));
            newSong.appendChild(createElement(doc, "artist", artist));
            newSong.appendChild(createElement(doc, "year", year));
            root.appendChild(newSong);
            saveXml(doc);
            System.out.println("Песня добавлена!");

            System.out.println("\nВведите исполнителя для поиска:");
            String searchArtist = scanner.nextLine();
            NodeList songList = doc.getElementsByTagName("song");
            boolean found = false;
            for (int i = 0; i < songList.getLength(); i++) {
                Element el = (Element) songList.item(i);
                String a = el.getElementsByTagName("artist").item(0).getTextContent();
                if (a.equalsIgnoreCase(searchArtist)) {
                    System.out.println("Найдена песня: "
                        + el.getElementsByTagName("title").item(0).getTextContent());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Песен исполнителя '" + searchArtist + "' не найдено.");
            }

            System.out.println("\nВведите название песни для удаления:");
            String delTitle = scanner.nextLine();
            songList = doc.getElementsByTagName("song");
            for (int i = songList.getLength() - 1; i >= 0; i--) {
                Element el = (Element) songList.item(i);
                String t = el.getElementsByTagName("title").item(0).getTextContent();
                if (t.equalsIgnoreCase(delTitle)) {
                    el.getParentNode().removeChild(el);
                    System.out.println("Песня удалена.");
                }
            }
            saveXml(doc);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static Element createElement(Document doc, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    private static void saveXml(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(new File(FILE_PATH)));
    }
}
