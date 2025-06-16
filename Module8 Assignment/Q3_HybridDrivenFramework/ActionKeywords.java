package Q3_HybridDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
    public static WebDriver driver;

    public static void openBrowser() {
        driver = new ChromeDriver();
    }

    public static void enterUrl(String url) {
        driver.get(url);
    }

    public static void clickSignin() {
        driver.findElement(By.className("login")).click(); // update as per actual
    }

    public static void enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public static void enterPassword(String password) {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public static void clickLogin() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public static void clickLogout() {
        driver.findElement(By.className("logout")).click();
    }

    public static void closeBrowser() {
        driver.quit();
    }
}