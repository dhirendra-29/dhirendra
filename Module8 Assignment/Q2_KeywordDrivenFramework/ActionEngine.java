package Q2_KeywordDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionEngine {
    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void enterUrl() {
        driver.get("https://demo.automationtesting.in/SignIn.html");
    }

    public void clickSignin() {
        driver.findElement(By.id("enterimg")).click();
    }

    public void enterEmail() {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
    }

    public void enterPassword() {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");
    }

    public void clickLogin() {
        // Fake login step here
        System.out.println("Login button clicked (mock)");
    }

    public void clickLogout() {
        System.out.println("Logout clicked (mock)");
    }

    public void closeBrowser() {
        driver.quit();
    }
}
