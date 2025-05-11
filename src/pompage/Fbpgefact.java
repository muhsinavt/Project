package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpgefact {
	WebDriver driver;
	@FindBy(id ="email")WebElement fbmail;
	@FindBy(id ="pass")
	WebElement fbpass;
	@FindBy(id ="login")
	WebElement fblg;
	public Fbpgefact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String email, String password) {
		fbmail.sendKeys(email);
		fbpass.sendKeys(password);
		
		
	}
public void login() {
	fblg.click();
}
}
