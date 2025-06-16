package Q3_HybridDrivenFramework;

import java.lang.reflect.Method;

public class DriverScript {
    public static void main(String[] args) throws Exception {
        ExcelReader reader = new ExcelReader("C:\\Users\\HP\\eclipse-workspace\\Excel.Reader\\exceldatafile.xlsx");

        for (int i = 0; i < reader.getRowCount(); i++) {
            String action = reader.getCellData(i, 0).toLowerCase().replace(" ", "");
            String data = reader.getCellData(i, 1);

            try {
                Method method;
                if (data.equalsIgnoreCase("null") || data.isEmpty()) {
                    method = ActionKeywords.class.getMethod(action);
                    method.invoke(null);
                } else {
                    method = ActionKeywords.class.getMethod(action, String.class);
                    method.invoke(null, data);
                }
            } catch (NoSuchMethodException e) {
                System.out.println("No method for: " + action);
            }
        }
    }
}
