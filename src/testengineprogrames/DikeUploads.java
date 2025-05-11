package testengineprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DikeUploads {
WebDriver driver;
@BeforeTest
public void beforeTest() {
	driver = new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
}

@SuppressWarnings("deprecation")
@Test 
public void main() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Thread.sleep(3000);
	
	Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\Autoit\\Fikeuplod.exe");
	Thread.sleep(5000);
}
}
