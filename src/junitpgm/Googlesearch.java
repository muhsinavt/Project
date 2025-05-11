






















package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Googlesearch
{
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void title()
	{
		String exp = "abc";
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
	@After
	public void ending()
	{
		driver.quit();
	}
}

//public static void main(String[] args) 