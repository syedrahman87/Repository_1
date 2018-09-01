package session2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	   try {
		
		   driver.get("https://www.google.com");
		   driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		   Thread.sleep(5000);
		 
		   
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	   driver.close();
	   driver.quit();
	}
	
	\
	
}

