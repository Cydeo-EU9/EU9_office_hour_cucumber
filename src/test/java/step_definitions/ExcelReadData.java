package step_definitions;

import org.apache.poi.xssf.usermodel.*;
import org.junit.*;

import java.io.*;

public class ExcelReadData {

    @Test
    public void readData() throws IOException {
        String path = "sample.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet worksheet = workbook.getSheet("Finance");
        System.out.println(worksheet.getRow(2).getCell(1));
        System.out.println(worksheet.getRow(3).getCell(2));

        System.out.println(worksheet.getLastRowNum());
        System.out.println(worksheet.getPhysicalNumberOfRows());

    }

    @Test
    public void writeData() throws IOException {
        String path = "sample.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Finance");

        XSSFCell date = sheet.getRow(0).createCell(3);
        date.setCellValue("Date");

        XSSFCell date1 = sheet.getRow(1).createCell(3);
        date1.setCellValue("15/06");

        XSSFCell date2 = sheet.getRow(2).createCell(3);
        date2.setCellValue("14/12");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();

    }


}
