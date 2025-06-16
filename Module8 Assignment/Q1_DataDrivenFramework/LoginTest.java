package Q1_DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\eclipse-workspace\\DataFramework\\data.xlsx";
        String[][] loginData = ExcelUtil.getExcelData(filePath, "Sheet1");

        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        for (String[] creds : loginData) {
            String email = creds[0];
            String password = creds[1];

            driver.get("https://demo.automationtesting.in/SignIn.html");
            
            driver.findElement(By.xpath("//input[contains(@class, 'form-control')]")).clear();
            driver.findElement(By.id("//input[contains(@class, 'form-control')]")).sendKeys(email);

            driver.findElement(By.xpath("//input[@type='password']")).clear();
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
            
            driver.findElement(By.id("//img[@id='enterimg']")).click(); // Login button

            try {
                Thread.sleep(3000); // Wait for response

                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains("Index.html")) {
                    System.out.println("Login successful for: " + email);
                } else {
                    System.out.println("Login failed for: " + email);
                }

            } catch (Exception e) {
                System.out.println("Error testing login for: " + email);
            }
        }

        driver.quit();
    }
}
