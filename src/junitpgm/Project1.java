package junitpgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	ChromeDriver driver = new ChromeDriver();
	
	@Before
	public void setup() {
			driver.get("https://magento.softwaretestingboard.com");
			driver.manage().window().maximize();
			
		}
		@Test
		public void title() {
			String exp = "LUMA";
			String act = driver.getTitle();
			System.out.println(act);	
			
			String src = driver.getPageSource();
			
			if(src.contains("LUMA")) {
				System.out.println("Title matched");
				}
			else {
				System.out.println("Title not matched");
			}
		}
		
		@After
		public void teardown() {
			//driver.quit();
		}
	
	}

