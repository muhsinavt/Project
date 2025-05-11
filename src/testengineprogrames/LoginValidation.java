package testengineprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidation {
	ChromeDriver driver;

		
		@BeforeTest
		public void beforetest() {
			driver = new ChromeDriver();
			driver.get("");
			driver.manage().window().maximize();
		}
		@Test
		public void main() throws IOException, Exception{
			driver.findElement(By.xpath("//*[@id='ulogin']")).sendKeys("muhsinaveeran303@gmail.com");
			driver.findElement(By.xpath("//*[@id='upass'")).sendKeys("Addperson@12");
			driver.findElement(By.xpath("//*[@id='sub_logbtn']")).click();
		Thread.sleep(3000);
		

	}

}
