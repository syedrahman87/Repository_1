package session8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng1 {

//No main method required for Object handler
	
	
	@Test(priority=1)
  public void test1() throws InterruptedException 
  {
	  
		  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
			
		     WebDriver driver = new ChromeDriver(); 
		     
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     
		     driver.manage().window().maximize();
		     
		     driver.get("https://www.facebook.com");
		     
		     Thread.sleep(5000);
		     
		     driver.close();
		     
		     driver.quit();
  }
	
	@Test(priority=3)
	  public void test2() throws InterruptedException
	  {
		  
			  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
				
			     WebDriver driver = new ChromeDriver(); 
			     
			     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			     
			     driver.manage().window().maximize();
			     
			     driver.get("https://www.google.com");
			     
			     Thread.sleep(5000);
			     
			     driver.close();
			     
			     driver.quit();
	  }
  
    
     
}
