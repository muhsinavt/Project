package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonapp {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}
	
	@Test
	public void loginDisplay() {
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile");
		
		WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		 searchbutton.click();
		
		 WebElement hellosignin=driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		 hellosignin.click();
		 
		 driver.navigate().back();
		 
		 WebElement carticon=driver.findElement(By.xpath("//div[contains(@id, 'nav-cart-text')]"));
		 carticon.click();
		 
		 
		 
	}
	  @After
	    public void teardown()
	    {
	   // driver.quit();
	    }

}
