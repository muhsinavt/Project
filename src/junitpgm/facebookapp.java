package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookapp {
ChromeDriver driver;
	
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void title()
	{
		String exp = "facebook";
		String act = driver.getTitle();
		System.out.println(act);
		if(exp.equals(act))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("title not matched");
		}
	}
	//@After
	//public void ending()
	//{
//	driver.quit();
//}
//}