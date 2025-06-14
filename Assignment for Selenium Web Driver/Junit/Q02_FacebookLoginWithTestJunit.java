package AssignmentForSeleniumWebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverConnection.DriverConnection;

public class Q2_FacebookLoginWithTest {

	String url = "https://www.facebook.com/";

	 WebDriver driver = DriverConnection.getDriver(url);

	@Test
	public void loginTest() {
		WebElement email  = driver.findElement(By.name("email"));
		email.sendKeys("selenium@gmail.com");
		WebElement password  = driver.findElement(By.name("pass"));
		password.sendKeys("user@123");
		WebElement loginBTN = driver.findElement(By.name("login"));
		loginBTN.click();
		
		System.out.println("Log In Successful!");
	}
}