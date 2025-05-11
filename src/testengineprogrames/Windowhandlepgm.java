package testengineprogrames;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Windowhandlepgm {
WebDriver driver;
@BeforeTest public void setUp()
{
	driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
public void test()
{
	Set<String> paraentwindow = driver.getWindowHandles();
	System.out.println("title of google "+driver.getTitle());
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/login/");
	
		
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.ebay.com/");
	System.out.println(driver.getTitle());
	
	ArrayList<String> windowdetails= new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowdetails.get(1));
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(paraentwindow);
	
}}
