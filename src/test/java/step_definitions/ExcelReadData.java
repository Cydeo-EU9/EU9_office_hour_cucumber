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


}
