package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompage.Fblgnpge;

public class FbloginTest {
	WebDriver driver;

	
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test

		public void testcheck() {
			Fblgnpge obj = new Fblgnpge(driver); //constructor called here
			obj.setValues("muhsi@gmail.com", "12345");
			obj.loginButn();
		}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	}