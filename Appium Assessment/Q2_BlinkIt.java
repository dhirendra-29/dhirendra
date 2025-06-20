package AppiumAssessment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Q2_BlinkIt {
	static AppiumDriver driver=null;
	public static void main(String[] args) throws InterruptedException
	{
		try {
			openBlinkitApp();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());	
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void openBlinkitApp() throws MalformedURLException, InterruptedException 
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("appium:deviceName", "Vivo Y21"); 
		cap.setCapability("appium:udid", "3082816709000HG"); 
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "12");
		cap.setCapability("appium:appPackage", "com.grofers.customerapp"); 
		cap.setCapability("appium:appActivity", "com.blinkit.intent.IntentReceiverActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
       Thread.sleep(7000);
       
       System.out.println("BlinkIt Launched");

       driver = new AppiumDriver(url, cap);
       Thread.sleep(10000);
       
       driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.grofers.customerapp:id/input_phone']")).sendKeys("8153854671");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.grofers.customerapp:id/continue_button']")).click();
       //OTP auto fetch wait 
       Thread.sleep(10000);
       driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.grofers.customerapp:id/select_location']")).click();
       
       driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.grofers.customerapp:id/edittext']")).sendKeys("Gandhinagr");
       
       driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.grofers.customerapp:id/location_title'])[1]")).click();
       
       driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.grofers.customerapp:id/enter_address']")).click();

       driver.findElement(By.xpath("//android.view.View[@content-desc='Electronics']")).click();
       
      


	
	
       
	
	
	
	
	}
}