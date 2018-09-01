package session8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\browser exe\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver(); 
			
			try
			{
			
			String URL = "http://www.seleniumeasy.com/test/input-form-demo.html";
	         driver.get(URL);

	          //driver.manage().window().maximize();
	         
	                 
	        WebElement txtFirstName = driver.findElement(By.name("first_name"));
	        
	        txtFirstName.sendKeys("syed");
	        
	        driver.findElement(By.name("last_name")).sendKeys("Rahman");
	        
	        driver.findElement(By.name("email")).sendKeys("syedrahman87@gmail.com");
	        
	        driver.findElement(By.name("phone")).sendKeys("9092118533");
	        
	             
	        driver.findElement(By.name("city")).sendKeys("Chennai");
	            
	        
	        WebElement Dropstate = driver.findElement(By.name("state"));
	        
	        Select dropdownstate = new Select(Dropstate);
	        
	        dropdownstate.selectByVisibleText("Indiana");
	        
	        driver.findElement(By.name("zip")).sendKeys("600014");
	        
	        driver.findElement(By.name("website")).sendKeys("www.google.com");
	        
	        
	        driver.findElement(By.xpath("//*[@value='yes']")).click();
	        
	        
	        driver.findElement(By.xpath("//*[@name='comment']")).click();
	        
	        //driver.findElement(By.xpath("//*[@class='btn btn-default]")).click();
	            
	        
	        WebElement Ziptext = driver.findElement(By.xpath("//*[text()='Zip Code']"));
	        
	        String ActualLabel  = Ziptext.getText();
	        
	        String ExpectedLabel = "Zip Code";
	        
	        if (ActualLabel.equals(ExpectedLabel)) {
	        	
	        	System.out.println("Pass");
				
			} else {
	           
				System.out.println("Fail");
			}

	        		
	                
	               
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
			
			driver.close();
			driver.quit();


		}

	}
