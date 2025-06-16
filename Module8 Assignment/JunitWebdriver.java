package WebDriverProgram;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWebdriver {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        // Assuming ChromeDriver is in your system PATH
        
    	driver = new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    }

    @Test
    void testGoogleSearch() {
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

       // Assertions.assertTrue(driver.getTitle().toLowerCase().contains("selenium webdriver"));
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

