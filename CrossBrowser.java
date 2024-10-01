package TESTNGattributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CrossBrowser {
	public static WebDriver driver;
	
	
	@Test
	public static void Method1() throws InterruptedException{
		
		 driver=new ChromeDriver();
		 driver.get("https://www.itlearn360.com/");
		 driver.manage().window().fullscreen();
		 Thread.sleep(2000);
		 WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
			sign.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			//user sign in
			WebElement element = driver.findElement(By.id("user_login"));//positive test case
			element.sendKeys("KAMATCHI11");
			Thread.sleep(2000);
	 
	    	WebElement element2 = driver.findElement(By.id("user_pass"));//positive test case
			element2.sendKeys("KAMATCHI456$");
			WebElement element3 = driver.findElement(By.name("wp-submit"));
			element3.click();
			driver.manage().window().maximize();
		   	Thread.sleep(2000);
		    WebElement element4 = driver.findElement(By.xpath("//span[text()='Logout']"));
		     element4.click();
		     driver.quit();
	}
		 
		 
		 @Test
			public static void Method2() throws InterruptedException{
				
				 driver=new EdgeDriver();
				 driver.get("https://www.itlearn360.com/");
				 driver.manage().window().fullscreen();
				 Thread.sleep(2000);
				 WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
					sign.click();
					driver.manage().window().fullscreen();
					Thread.sleep(2000);
					//user sign in
					WebElement element = driver.findElement(By.id("user_login"));//positive test case
					element.sendKeys("KAMATCHI11");
					Thread.sleep(2000);
			 
			    	WebElement element2 = driver.findElement(By.id("user_pass"));//positive test case
					element2.sendKeys("KAMATCHI456$");
					WebElement element3 = driver.findElement(By.name("wp-submit"));
					element3.click();
					driver.manage().window().maximize();
				   	Thread.sleep(2000);
				    WebElement element4 = driver.findElement(By.xpath("//span[text()='Logout']"));
				     element4.click();
				     driver.quit();
	
	}
	}