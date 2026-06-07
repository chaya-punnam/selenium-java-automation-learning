package Day20_Framework_Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtility {

    public static String getData(
            String filePath,
            String sheetName,
            int row,
            int cell)
            throws Exception {

        FileInputStream file =
                new FileInputStream(
                        filePath);

        XSSFWorkbook workbook =
                new XSSFWorkbook(file);

        XSSFSheet sheet =
                workbook.getSheet(
                        sheetName);

        String value =
                sheet.getRow(row)
                        .getCell(cell)
                        .getStringCellValue();

        workbook.close();

        return value;
    }
}
