package Appium_Testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Q4_Calculator {
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		try {
			openCalculatorApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void openCalculatorApp() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("appium:deviceName", "Vivo Y21"); 
		cap.setCapability("appium:udid", "3082816709000HG"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "12");
		cap.setCapability("appium:appPackage", "com.adrianmejia.calculator"); 
		cap.setCapability("appium:appActivity", "com.adrianmejia.calculator.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver(url, cap);
		//Addition(+)
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"1\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"8\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"+\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"=\"]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"23\"]")).click();
		Thread.sleep(1000);
		//Clear Calculation
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"C\"]")).click();
		Thread.sleep(1000);
		//Substraction
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"1\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"8\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"-\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"=\"]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"13\"]")).click();
		Thread.sleep(1000);
		//Clear Calculation
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"C\"]")).click();

		//Multiplication
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"1\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"0\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"×\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"=\"]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"50\"]")).click();
		Thread.sleep(1000);
		//Clear Calculation
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"C\"]")).click();
		
		//Division
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"1\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"0\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"÷\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]")).click();

		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"=\"]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"2\"]")).click();
		Thread.sleep(1000);
		//Clear Calculation
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"C\"]")).click();

		System.out.println("Additon +");
		System.out.println("Substraction -");
		System.out.println("Multiplication ×");
		System.out.println("Divison ÷ ");
		System.out.println("---Done");
		
		driver.close();
	}
}
