package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglbsfact {

	WebDriver driver;
	@FindBy(id ="name")WebElement username;
	@FindBy(id ="pass")
	WebElement password;
	@FindBy(id ="login")
	WebElement login;
	public Swaglbsfact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String email, String password) {
		username.sendKeys(email);
		password.sendKeys(password);
		
		
	}
public void login() {
	login.click();
}
}

