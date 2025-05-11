package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompage.Fbpgefact;



public class fbpgefct  {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test

		public void testlogin() {
		Fbpgefact obj = new Fbpgefact(driver); //constructor called here
			obj.setValues("muhsi@gmail.com", "adadc");
			obj.login();
		}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}


}
