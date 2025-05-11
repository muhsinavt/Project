package testengineprogrames;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDrivenPgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	

}
