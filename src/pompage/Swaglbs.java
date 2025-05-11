package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swaglbs {

	WebDriver driver;
	
	// object repository without page factory
	By username = By.name("name");
	By pwd = By.name("pass");
	By login = By.name("login");
	
	//constructor
	public Swaglbs(WebDriver driver) {
		this.driver = driver;
		
	}
public void setValues(String name, String password) {
	driver.findElement(username).sendKeys(name);
	driver.findElement(pwd).sendKeys(password);
	}

public void loginButn() {
	{
		driver.findElement(login).click();
	}
	
}
}
