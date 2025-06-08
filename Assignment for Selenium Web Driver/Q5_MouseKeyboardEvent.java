package AssignmentForSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Connection.DriverConnection;

public class Q5_MouseKeyboardEvent {

    public static void main(String[] args) {
        String url = "https://demo.automationtesting.in/Register.html";
        WebDriver driver = DriverConnection.getDriver(url);  // 👈 This uses your existing driver setup

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("DK");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Chavda");

        WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        address.sendKeys("Gandhinagar");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("dkchavda29@gmail.com");
       
        WebElement Mobile = driver.findElement(By.xpath("//input[@type='tel']"));
        Mobile.sendKeys("9876543210");

       WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
       gender.click();

        driver.findElement(By.id("checkbox1")).click(); // Cricket
        driver.findElement(By.id("checkbox3")).click(); // Hockey

        WebElement languageBox = driver.findElement(By.id("msdd"));
        Actions actions = new Actions(driver);
        actions.moveToElement(languageBox).click().perform();
        driver.findElement(By.xpath("//a[text()='English']")).click();

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        WebElement countrySearch = driver.findElement(By.xpath("//input[@type='search']"));
        countrySearch.sendKeys("India");
        countrySearch.sendKeys(Keys.ENTER);

        new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText("1995");
        new Select(driver.findElement(By.xpath("//select[@placeholder='Month']"))).selectByVisibleText("June");
        new Select(driver.findElement(By.id("daybox"))).selectByVisibleText("5");

        driver.findElement(By.id("firstpassword")).sendKeys("Test@1234");
        driver.findElement(By.id("secondpassword")).sendKeys("Test@1234");

        WebElement submitBtn = driver.findElement(By.id("submitbtn"));
        actions.moveToElement(submitBtn).click().perform();  // Extra style with Actions
        try { Thread.sleep(5000); } catch (InterruptedException e) {}

        System.out.println("successfully performed!");
        driver.quit();
    }
}
