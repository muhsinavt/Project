package testengineprogrames;

import org.testng.annotations.Test;

public class EnabledPgrm {
	@Test(priority = 1, invocationCount=2 )// invocation used to execute the mthod no of times
	public void Reg() {
		System.out.println("Reg");
		
		
	}
	@Test(priority = 2)
	public void log() {
		System.out.println("log");
		
	}
	@Test(priority = 3,enabled= false)// enabled = false skip the method
	public void home() {
		System.out.println("home");
		
	}
	@Test(priority = 4)
	public void cart() {
		System.out.println("cart");
		
	}
	}




