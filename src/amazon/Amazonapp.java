package amazon;

public class Amazonapp {
	driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
public void loginDisplay()
{
	WebElement search = driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver = webdriver.Chrome()
			driver.get("https://www.amazon.in")
			search_box=driver.find_element(By.ID,"twotabsearchtextbox")
			search_box.send_keys("mobiles")
			search_box.send_keys("mobiles")
			search_box.send_keys(keys.RETURN)
			
			
			
			

}
