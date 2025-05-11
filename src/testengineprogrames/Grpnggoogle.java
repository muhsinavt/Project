package testengineprogrames;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grpnggoogle {
	
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	//@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	@BeforeMethod(alwaysRun = true)
//	@BeforeMethod
	public void mthd()
	{
	System.out.println("Before Method");
	
	}
@Test(priority = 1, groups = "verify")
public void title(){
	String act = driver.getTitle();
	System.out.println(" title is "+ act);
}
@Test(priority = 2, groups = "validation")
public void ttest2(){
	
	System.out.println("test2");
}
@Test(priority = 3, groups = "validation")
public void ttest3(){
	
	System.out.println("test3");
}
@AfterMethod(alwaysRun = true)
//@AfterMethod
public void aftermthd(){
	
	System.out.println("aftermthd");
}
@AfterTest(alwaysRun = true)
//@AfterTest
public void teardown(){
	driver.quit();
	
}

}