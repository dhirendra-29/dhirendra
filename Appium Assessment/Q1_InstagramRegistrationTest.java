package AppiumAssessment;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Q1_InstagramRegistrationTest {

    public static void main(String[] args) throws InterruptedException , TimeoutException{
        AppiumDriver driver = null;

        try {
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("appium:deviceName", "Vivo Y21"); 
    		cap.setCapability("appium:udid", "3082816709000HG"); 
    		cap.setCapability("platformName", "Android");
    		cap.setCapability("appium:platformVersion", "12");
    		cap.setCapability("appium:appPackage", "com.instagram.android"); 
    		cap.setCapability("appium:appActivity", "com.instagram.mainactivity.LauncherActivity");

    		URL url = new URL("http://127.0.0.1:4723/wd/hub");
           Thread.sleep(15000);

            System.out.println("Instagram Launched");
            
    		
    		driver = new AppiumDriver(url, cap);
            Thread.sleep(10000);
    		
    		driver.findElement(By.xpath("//android.widget.Button[@content-desc= 'Create new account']/android.view.ViewGroup")).click();
    		
            Thread.sleep(5000);
    		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Mobile Number']/android.view.ViewGroup[1]")).click();
            Thread.sleep(3000);
            
    		driver.findElement(By.xpath("//android.widget.EditTextn")).sendKeys("8153854671");
    		
    		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Next']/android.view.ViewGroup")).click();
    		Thread.sleep(2000);

    		
    		// Capture screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils .copyFile(srcFile, new File("D:\\Screenshot\\insta_signup.png"));

            System.out.println("📸 Screenshot saved after signup step");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
