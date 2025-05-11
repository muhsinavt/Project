package junitpgm;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project3_lgn {
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setup() {
			driver.get("https://magento.softwaretestingboard.com");
			driver.manage().window().maximize();
			}
	@Test // account login
	public void login() {
		
		WebElement signin= driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']"));
		signin.click();
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("muhsinaveeran303@gmail.com");
		   
		WebElement paswrd= driver.findElement(By.xpath("//input[@id='pass']"));
		paswrd.sendKeys("Muhsi@37");

		WebElement submit= driver.findElement(By.xpath("//button[@class='action login primary']\r\n"));
	    submit.click();
	    
	// to print text
	    
	    WebElement yogamsg = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/a/span/span[1]"));
        String msg = yogamsg.getText();

        System.out.println("text:" +msg);
        
	    
	    
	    WebElement whatsnew = driver.findElement(By.xpath("//a[@id='ui-id-3']"));
		whatsnew.click();
		driver.navigate().back();
		
	    WebElement sale= driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/sale.html']"));
	    String saletxt =sale.getDomAttribute("href");
	   System.out.println(saletxt);
	    sale.click();
	    
	    
	   WebElement women = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
	   women.click();
	   WebElement tops = driver.findElement(By.xpath("//*[@id=\"narrow-by-list2\"]/dd/ol/li[1]"));
	   tops.click();
	  WebElement catgry = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]"));
	   catgry.click();
	    catgry = driver.findElement(By.xpath("//a[@id='ui-id-11']"));
        catgry.click();
       WebElement cart = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[1]/div[1]/form/button/span"));
      cart.click();
	}
	@Test
    public void test2() { // link count
		List<WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("NO OF LINKS = " +li.size());
	for(WebElement e:li) {
		String lin =e.getDomAttribute("href");
		String linktext =e.getText();
		System.out.println(lin+"---"+linktext);
		}
	
	}
	String url= "https://magento.softwaretestingboard.com";
	@Test
	public void linktest() throws Exception {
	    URI ob = new URI(url);
	    URL link = ob.toURL();
		HttpURLConnection con =(HttpURLConnection)link.openConnection();
		
	   int respcode = con.getResponseCode();
		
     	System.out.println("Response code :" +respcode);
		if(respcode==200)
		{
			System.out.println("url is valid");
		}
	    else
		{
		System.out.println("url is not valid");
		}
	
	}
	@Test
	public void logo() {
		WebElement lumalogo = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a"));
			boolean l = lumalogo.isDisplayed();
			if (l== true) {
				System.out.println("logo is displayed");
			}
			else {
				
				System.out.println("logo not displayed");
			}
	}
	
@Test
public void Scrnshot() throws Exception {
	File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s,new File("C://Users//Admin//OneDrive//Pictures//Screenshots//projectscreenshot1.png"));
	System.out.println("Screenshot saved succesfully");	
	
	WebElement searchbar = driver.findElement(By.xpath("//input[@id='search']"));
    File s1 = searchbar.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s1,new File("./screenshot/searchbar_screenshot.png"));
    System.out.println("webelement Screenshot saved succesfully");
}
@After
public void teardown() {
	driver.quit();
}
}




