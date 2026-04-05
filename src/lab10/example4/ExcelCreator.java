package lab10.example4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelCreator {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Товары");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Товар");
        header.createCell(1).setCellValue("Характеристики");
        header.createCell(2).setCellValue("Стоимость");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Книга");
        row1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов");
        row1.createCell(2).setCellValue(500.0);

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Компьютер");
        row2.createCell(1).setCellValue("Процессор: i5, ОЗУ: 16ГБ");
        row2.createCell(2).setCellValue(25000.0);

        try (FileOutputStream outputStream = new FileOutputStream("example.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Данные успешно записаны в файл example.xlsx!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}