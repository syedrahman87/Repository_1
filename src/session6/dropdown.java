package session6;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		try
		{
		
		String URL = "http://toolsqa.com/automation-practice-form/";
         driver.get(URL);

          //driver.manage().window().maximize();
        
        WebElement ele1 = driver.findElement(By.id("continents"));
        
        Select dropdown = new Select(ele1);
        
        dropdown.selectByVisibleText("Antartica");
        
        Thread.sleep(5000);
        
       java.util.List<WebElement> Listdrop = dropdown.getOptions();
       int listsize = Listdrop.size();
       System.out.println("Size is :" +listsize);
       
                                
               
		}
		catch(Exception e)
		{}

		driver.close();
		driver.quit();
	


	}

}
