package Day19;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    public static String getData(int row,
                                 int cell)
            throws Exception {

        FileInputStream file =
        new FileInputStream(
        "LoginData.xlsx");

        XSSFWorkbook workbook =
        new XSSFWorkbook(file);

        XSSFSheet sheet =
        workbook.getSheet("Sheet1");

        String value =
        sheet.getRow(row)
             .getCell(cell)
             .getStringCellValue();

        workbook.close();

        return value;
    }
}
