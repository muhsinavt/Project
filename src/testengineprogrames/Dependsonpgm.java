package testengineprogrames;

import org.testng.annotations.Test;

public class Dependsonpgm {

@Test()
public void reg() {
	System.out.println("Reg");
	
	
}
@Test(dependsOnMethods="reg")
public void log() {
	System.out.println("log");
	
}
@Test(dependsOnMethods={"reg","log"})
public void home() {
	System.out.println("home");
	
}
}



