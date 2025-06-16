package Q3_HybridDrivenFramework;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import java.io.File;

public class ExcelReader {
    Workbook workbook;

    public ExcelReader(String excelPath) {
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\Excel.Reader\\exceldatafile.xlsx"));
            workbook = WorkbookFactory.create(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCellData(int row, int col) {
        Sheet sheet = workbook.getSheetAt(0);
        Row r = sheet.getRow(row);
        if (r == null) return "";
        Cell c = r.getCell(col);
        return c == null ? "" : c.toString();
    }

    public int getRowCount() {
        return workbook.getSheetAt(0).getLastRowNum() + 1;
    }
}
