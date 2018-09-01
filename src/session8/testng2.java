package session8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng2 {
 
	@Test(priority=4)
  public void testing1() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
			
		     WebDriver driver = new ChromeDriver(); 
		     
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     
		     driver.manage().window().maximize();
		     
		     driver.get("https://www.flipkart.com");
		     
		     Thread.sleep(5000);
		     
		     driver.close();
		     
		     driver.quit();
}
	
	@Test(priority=2, enabled=false)
	  public void testing2() throws InterruptedException {
			  
			  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
				
			     WebDriver driver = new ChromeDriver(); 
			     
			     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			     
			     driver.manage().window().maximize();
			     
			     driver.get("https://www.amazon.com");
			     
			     Thread.sleep(5000);
			     
			     driver.close();
			     
			     driver.quit();
	}	
}
