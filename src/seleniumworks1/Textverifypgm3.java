package seleniumworks1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverifypgm3 {
	static String url= "https://www.google.co.in/";
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		String src= driver.getPageSource();
		
		if(src.contains("google")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	driver.quit();
	
		}

}
