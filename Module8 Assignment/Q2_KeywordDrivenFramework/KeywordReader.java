package Q2_KeywordDrivenFramework;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;

public class KeywordReader {
    public ArrayList<String> readKeywords(String filePath) {
        ArrayList<String> keywords = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Excel.Reader\\keywords.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Cell cell = row.getCell(0);
                if (cell != null && cell.getCellType() == CellType.STRING) {
                    keywords.add(cell.getStringCellValue().toLowerCase());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return keywords;
    }
}
