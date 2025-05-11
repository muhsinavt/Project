import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff1 {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
	}
	@Test
	public void googlesearch() {
		WebElement day = driver.findElement(By.ByXPath)
	}
	

}
