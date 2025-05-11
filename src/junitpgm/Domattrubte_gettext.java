package junitpgm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domattrubte_gettext {
	
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
		}
		@Test
		public void link() {
			WebElement account=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));		
String s=account.getText();
System.out.println("get text"+s);
String s2=account.getDomAttribute("href");
System.out.println("get dom attribute"+s2);}
	
@After
public void teardown()
{
	//driver.quit();
}
}