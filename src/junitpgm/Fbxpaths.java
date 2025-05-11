package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fbxpaths {

		ChromeDriver driver;
			
			@Before
			public void setup() {
				driver= new ChromeDriver();
				driver.get("https://www.facebook.com/login/");

			}
			@Test
			public void login() {
				WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("abc@gmail.com");
				WebElement pswrd= driver.findElement(By.xpath("//input[@id='pass']"));
				   pswrd.sendKeys("9852");
				WebElement log= driver.findElement(By.xpath("//button[@name='login']"));
				 log.click();
							
			}
			   @After
			    public void teardown()
			    {
			    driver.quit();
			    }
				
				

}
