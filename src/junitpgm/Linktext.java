package junitpgm;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Linktext {


	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
@Test
public void link()
{
	List <WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("No of links"+li.size());
	
	for(WebElement e:li) {
		String lin = e.getDomAttribute("href");
		String linktext=e.getText();
		System.out.println(lin+"---"+linktext);
	}}

public void teardown()
{
	//driver.quit();
}
	
}