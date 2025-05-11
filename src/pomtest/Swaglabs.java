package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompage.Swaglbs;

public class Swaglabs {
	WebDriver driver;

	
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test

		public void testcheck() {
			Swaglbs obj = new Swaglbs(driver); //constructor called here
			obj.setValues("muhsi", "12345");
			obj.loginButn();
		}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	}
