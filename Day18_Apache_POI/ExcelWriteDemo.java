import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {

    public static void main(String[] args) throws Exception {

        XSSFWorkbook workbook =
                new XSSFWorkbook();

        XSSFSheet sheet =
                workbook.createSheet("Sheet1");

        sheet.createRow(0)
                .createCell(0)
                .setCellValue("Name");

        sheet.getRow(0)
                .createCell(1)
                .setCellValue("Age");

        sheet.createRow(1)
                .createCell(0)
                .setCellValue("Ravi");

        sheet.getRow(1)
                .createCell(1)
                .setCellValue(20);

        FileOutputStream file =
                new FileOutputStream("Output.xlsx");

        workbook.write(file);

        workbook.close();
        file.close();

        System.out.println("Excel File Created Successfully");
    }
}