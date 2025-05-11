package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblgnpge {
	WebDriver driver;
	
	// object repository without page factory
	By fbemail = By.name("email");
	By pwd = By.name("pass");
	By login = By.name("login");
	
	//constructor
	public Fblgnpge(WebDriver driver) {
		this .driver = driver;
		
	}
public void setValues(String email, String password) {
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(pwd).sendKeys(password);
	}
public void loginButn() {
	driver.findElement(login).click();
}
}
