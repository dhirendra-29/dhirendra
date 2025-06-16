package Q2_KeywordDrivenFramework;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        KeywordReader reader = new KeywordReader();
        ActionEngine engine = new ActionEngine();

        ArrayList<String> steps = reader.readKeywords("C:\\Users\\HP\\eclipse-workspace\\Excel.Reader\\keywords.xlsx");

        for (String step : steps) {
            switch (step) {
                case "open browser":
                    engine.openBrowser();
                    break;
                case "enter url":
                    engine.enterUrl();
                    break;
                case "click signin":
                    engine.clickSignin();
                    break;
                case "enter email":
                    engine.enterEmail();
                    break;
                case "enter password":
                    engine.enterPassword();
                    break;
                case "click login":
                    engine.clickLogin();
                    break;
                case "click logout":
                    engine.clickLogout();
                    break;
                case "close browser":
                    engine.closeBrowser();
                    break;
                default:
                    System.out.println("Unknown step: " + step);
            }
        }
    }
}
