package testengineprogrames;

import org.testng.annotations.Test;

public class Grpngprgm {
    @Test(priority = 1, groups = {"sanity"})
    public void Test1() {
		System.out.println("t1");
		
		
	}
	@Test(priority = 2,groups = {"sanity"})
	public void Test2() {
		System.out.println("t2");
		
	}
	@Test(priority = 3,groups = {"smoke"})
	public void Test3() {
		System.out.println("t3");
		
	}
	}




}
