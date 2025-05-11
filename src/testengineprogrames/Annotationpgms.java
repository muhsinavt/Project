package testengineprogrames;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationpgms {
	@BeforeTest
	public void setup()
	{
		System.out.println("before test , browser open");
	}
	@BeforeMethod
		public void method()
		{
			System.out.println("before method , url loading");
		
			}

		@Test
		public void test1() {
			System.out.println("test 2");
			
		}
		 
			@Test
			public void test2() {
				System.out.println("test 2");
				
			}
			
			@Test
			public void test3() {
				
				System.out.println("test 3");
				
			}	
			
			@Test
			public void test4() {
				System.out.println("test 4");
				
			}
			@AfterMethod
			
			public void aftermtheod()
			{
				System.out.println("after method");
			}
			@AfterTest
			public void teardown() {
				System.out.println("afte test");
			}
		
	}

