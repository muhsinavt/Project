package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralarealestate {


ChromeDriver driver;
	
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");

	}
	
	@Test
	public void login() {
		WebElement username=driver.findElement(By.id("ulogin"));
		username.sendKeys("muhsina");
		
		WebElement password=driver.findElement(By.id("upass"));
	    password.sendKeys("9852");
	    

		WebElement log=driver.findElement(By.name("sub_logbtn"));
	    log.click();
	}
	  @After
	    public void teardown()
	    {
	    driver.quit();
	    }
		
}