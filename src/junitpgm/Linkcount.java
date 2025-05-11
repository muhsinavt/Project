package junitpgm;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Linkcount {
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
	List<WebElement> li=driver.findElements(By.tagName("a"));// findelmntsss stored in list
	System.out.println("No of links"+li.size());
	
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	String btntnx=login.getDomAttribute("name");// which attribute value neeeded that will peint here 
	//it is name and it is stored in string data type value will be login
	System.out.println(btntnx);
}


@After
public void teardown()
{
	//driver.quit();
}
}
