package junitpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplayed {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
	}
	//@Test
	//public void googlesearch()
//	{
	//	WebElement rediflogo =driver.findElement(By.xpath("//"));
		//boolean 1 = rediflogo.isDisplayed();
	//}
}
