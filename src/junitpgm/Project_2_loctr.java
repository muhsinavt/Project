package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_2_loctr {
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setup() {
			driver.get("https://magento.softwaretestingboard.com");
			driver.manage().window().maximize();
			
		}
		@Test // account creation
		public void login() {
			
			WebElement createacc= driver.findElement(By.xpath("//div[@class='panel header']//a[text()='Create an Account']\r\n"));
			createacc.click();
			
			WebElement fstnme= driver.findElement(By.xpath("//input[@id='firstname']"));
			fstnme.sendKeys("muhsina");
			
			WebElement lstnme= driver.findElement(By.xpath("//input[@id='lastname']"));
			lstnme.sendKeys("vt");
			
			WebElement email= driver.findElement(By.id("email_address"));
			email.sendKeys("muhsinaveeran303@gmail.com");
			   
			WebElement paswrd= driver.findElement(By.xpath("//input[@id='password']"));
			paswrd.sendKeys("Muhsi@37");

			WebElement paswrd_confrm= driver.findElement(By.xpath("//input[@id='password-confirmation']"));
			paswrd_confrm.sendKeys("Muhsi@37");
				

			WebElement submiit= driver.findElement(By.xpath("//button[@title='Create an Account']\r\n"));
		    submiit.click();

			driver.navigate().back();
}
		@After
		public void teardown() {
	    // driver.quit();
}

}