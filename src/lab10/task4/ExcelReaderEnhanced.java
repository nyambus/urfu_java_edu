package lab10.task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderEnhanced {
    public static void main(String[] args) {
        String filePath = "example.xlsx";

        try (FileInputStream file = new FileInputStream(filePath)) {
            Workbook workbook;
            try {
                workbook = new XSSFWorkbook(file);
            } catch (IOException e) {
                System.out.println("Ошибка: не удалось открыть файл Excel. "
                    + "Проверьте формат файла (ожидается .xlsx).");
                return;
            }

            if (workbook.getNumberOfSheets() == 0) {
                System.out.println("Ошибка: лист не найден. Проверьте, что файл содержит хотя бы один лист.");
                workbook.close();
                return;
            }

            Sheet sheet = workbook.getSheetAt(0);

            System.out.println("Чтение листа: " + sheet.getSheetName());
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл '" + filePath + "' не найден. "
                + "Убедитесь, что файл находится в корне проекта.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
