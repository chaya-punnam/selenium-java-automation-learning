import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream file =
                new FileInputStream("TestData.xlsx");

        XSSFWorkbook workbook =
                new XSSFWorkbook(file);

        XSSFSheet sheet =
                workbook.getSheet("Sheet1");

        String name =
                sheet.getRow(1)
                        .getCell(0)
                        .getStringCellValue();

        System.out.println("Name: " + name);

        workbook.close();
        file.close();
    }
}