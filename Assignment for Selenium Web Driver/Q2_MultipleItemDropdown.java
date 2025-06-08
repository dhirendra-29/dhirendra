package AssignmentForSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Q2_MultipleItemDropdown {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://phptravels.com/demo/";
        WebDriver driver = DriverConnection.getDriver(url);

        WebElement Fname = driver.findElement(By.name("first_name"));
        Fname.sendKeys("Dhirendrasinh");
        WebElement Lname = driver.findElement(By.name("last_name"));
        Lname.sendKeys("Chavda");
        WebElement countryCode = driver.findElement(By.id("country_id"));
        countryCode.click();

        Select select = new Select(countryCode);
        select.selectByVisibleText("India +91"); 
        
        WebElement Wnumber = driver.findElement(By.name("whatsapp"));
        Wnumber.sendKeys("8153854671");
        
        WebElement BusinessName = driver.findElement(By.name("business_name"));
        BusinessName.sendKeys("ABC pvt. ltd.");
        
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("dhirendrachavda2004@gmail.com");
        
        WebElement Result = driver.findElement(By.id("number"));
        Result.sendKeys("17");
        
        WebElement submitBTN = driver.findElement(By.id("demo"));
        submitBTN.sendKeys("17");
        
       Thread.sleep(3000);
       
       driver.close();
        
        
    }
}
