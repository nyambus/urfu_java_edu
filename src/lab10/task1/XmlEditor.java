package lab10.task1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XmlEditor {
    private static final String FILE_PATH = "src/lab10/task1/songs.xml"; // Имя файла для песен

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
            NodeList songs = doc.getElementsByTagName("song");
            for (int i = 0; i < songs.getLength(); i++) {
                Element el = (Element) songs.item(i);
                if (el.getElementsByTagName("artist").item(0).getTextContent().equalsIgnoreCase(searchArtist)) {
                    System.out.println("Найдена песня: " + el.getElementsByTagName("title").item(0).getTextContent());
                }
            }

            System.out.println("\nВведите название песни для удаления:");
            String delTitle = scanner.nextLine();
            for (int i = 0; i < songs.getLength(); i++) {
                Element el = (Element) songs.item(i);
                if (el.getElementsByTagName("title").item(0).getTextContent().equalsIgnoreCase(delTitle)) {
                    el.getParentNode().removeChild(el);
                    System.out.println("Песня удалена.");
                }
            }
            saveXml(doc);

        } catch (Exception e) {
            e.printStackTrace();
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