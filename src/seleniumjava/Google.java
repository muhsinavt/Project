package seleniumjava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
	
		 ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/"); // open url
driver.manage().window().maximize(); // maxmise window
//driver.close();// cuurent tab will close
driver.quit(); // entair browser will close
	}

}
