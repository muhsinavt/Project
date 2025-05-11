
package testengineprogrames;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramtspgrms {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();	
}
@Parameters({"Username","Password"})
@Test
public void login(String Username, String Password) {
	System.out.println(Username);
	System.out.println(Password);
}
}
