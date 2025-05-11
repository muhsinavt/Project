package testengineprogrames;

import org.testng.annotations.Test;

public class PriorityPgms {
	@Test(priority = 1, invocationCount=2 )// invocation used to execute the mthod no of times
	public void Reg() {
		System.out.println("Reg");
		
		
	}
	@Test(priority = 2)
	public void log() {
		System.out.println("log");
		
	}
	@Test(priority = 3)
	public void home() {
		System.out.println("home");
		
	}
	}


