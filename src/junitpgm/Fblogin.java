package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
ChromeDriver driver;
	
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

	}
	
	@Test
	public void login() {
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		//driver.findElemnts(By.id(“email”)).sendKeys(“abce”);
		
	    // used to locate single web elemnt by findElement
		// id is dynamic so xapth or other attribute used
		// sendkeys are used pass the values input string values

		
		WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("9852");
	    

		WebElement log=driver.findElement(By.name("login"));
	    log.click();
		
		
	
	}
    @After
    public void teardown()
    {
    //	driver.quit();
    }
	
	
	
}
