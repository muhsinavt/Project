import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	static String url="https://magento.softwaretestingboard.com";
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		String src = driver.getPageSource();
		
		if(src.contains("LUMA")) {
			System.out.println("Pass");
			}
		else {
			System.out.println("fail");
			
		}
		//driver.quit();
		
		

	}

}
