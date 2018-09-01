package session5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Commentspractice {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		try
		{
		
		String URL = "http://toolsqa.com/automation-practice-form/";
         driver.get(URL);

          //driver.manage().window().maximize();
        WebElement ele1 = driver.findElement(By.xpath("//input[@name='firstname']/preceding-sibling::strong"));
        System.out.println("Label is:" +ele1.getText());
        
        WebElement elem1 = driver.findElement(By.name("firstname"));
        System.out.println("Attribute is:" +elem1.getAttribute("type"));
        System.out.println("Tag is:" +elem1.getTagName());
        
        Dimension dim = elem1.getSize();
        System.out.println("Height Size is:" +dim.getHeight());
        System.out.println("width size is:" +dim.getWidth());
              
        Point Location =  elem1.getLocation();
        System.out.println("Location X is :" +Location.x);
        System.out.println("Location Y is :" +Location.getY());
             
       
        
		}
		catch(Exception e)
		{}

		driver.close();
		driver.quit();
		

	}

}
