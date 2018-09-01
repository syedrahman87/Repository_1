package session5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands_getmethod {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		String URL = "http://www.google.com/";
          driver.get(URL);

          driver.manage().window().maximize();
           
          driver.getTitle().length();
          
          String title = driver.getTitle(); 
                         
          int leng =  title.length();
          
          System.out.println("title is:" +title);
          
          System.out.println("length:" +leng);
          
          driver.getCurrentUrl();
            
          String getcurr = driver.getCurrentUrl();
            
          System.out.println("current url:" +getcurr);
            
            
          //expected URL & Print
          
          String expectedurl = "https://www.google.com/";
          if (getcurr.equals (expectedurl))
          {
          
           System.out.println("value is true");
                      
          }
          else {
        	  System.out.println("expected url value is false"); 
          }
          
         driver.getPageSource().length();
         
         int pagesourcelen =  driver.getPageSource().length();
	
         System.out.println("pagesource:" +pagesourcelen);
         
         
       WebElement web1 =  driver.findElement(By.id(""));
       
       
         
         driver.close();
         driver.quit();
         

	}

}
