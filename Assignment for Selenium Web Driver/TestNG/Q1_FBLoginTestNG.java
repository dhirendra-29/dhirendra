package AssignmentTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class Q1_FBLoginTestNG {

    WebDriver driver;
    String url = "https://www.facebook.com/";

    @BeforeClass
    public void setUp() {

        driver = DriverConnection.getDriver(url);
    }

    @Test
    public void loginTest() throws InterruptedException {

        driver.findElement(By.id("email")).sendKeys("your_email_here");

        driver.findElement(By.id("pass")).sendKeys("your_password_here");

        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
