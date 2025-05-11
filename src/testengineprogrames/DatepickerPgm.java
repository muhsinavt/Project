package testengineprogrames;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatepickerPgm {

	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void datepicker() throws Exception{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id="datepicker1\"]")).click();
		datepickermethod("Augest 2025","23");
	}
	
	
	private void datepickermethod(String expmonth, String expdate)
	{
		While (true)
			{
				String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();			}
		
		System.out.println("month=" + month);
		
	if(month.equals(expmonth))
		{
		break;
		
		}else
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}}
	private void While(boolean b) {
		// TODO Auto-generated method stub
		
	}
	List<webElement> date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/body/tr/td/a"));
			for(WebElement d : date) {
				String datetext= d.getText();
				if( datetext.equals(expdate)){
					d.click();
					System.out.println("Date selected");
					break;
		}
		}
}
}