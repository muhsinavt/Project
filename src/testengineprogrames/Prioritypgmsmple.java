package testengineprogrames;

import org.testng.annotations.Test;

public class Prioritypgmsmple {
	@Test()
	public void Reg() {
		System.out.println("reg");
	}
	@Test()
	public void log() {
		System.out.println("log");
	}
	
	@Test()
	public void home() {
		System.out.println("home");
	}	
	@Test()
	public void cart( priority=1){
		System.out.println("cart");
	}	
}
	//@Test()
	//public void home() {
		//	System.out.println("home");
//}
//@Test()
//public void cart( priority=1) {
//		System.out.println("cart");
		//	}


