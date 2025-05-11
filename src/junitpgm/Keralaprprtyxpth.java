package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaprprtyxpth {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{

		driver= new ChromeDriver();
	    driver.get("https://keralaproperty.in/member/login/");
	}
	
	
	@Test
	public void login() {
		WebElement aa= driver.findElement(By.xpath("//input[@name='ulogin']"));
		aa.sendKeys("abc@gmail.com");
		WebElement pswrd= driver.findElement(By.xpath("//input[@id='upass']"));
		   pswrd.sendKeys("9852");
		WebElement cc= driver.findElement(By.xpath("//input[@id='sub_logbtn']"));
		 cc.click();
	
	
	
	
	}
	@After
	public void teardown()
	{
	driver.quit();
	}



}
