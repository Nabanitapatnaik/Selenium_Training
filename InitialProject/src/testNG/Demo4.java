package testNG;

import org.testng.annotations.Test;

public class Demo4 {

	@Test(dependsOnMethods= {"loginApIHomeLoan"})
	public void webloginhomeLoan()
	{
	System.out.println("SeleniumHome");
		
	}
@Test(enabled=false)
public void mobileloginHomeLoan()
{
System.out.println("AppiumHome");
	
}
@Test
public void loginApIHomeLoan()
{
System.out.println("RestApIHome");
	
}
		
	
	
	
	
	
	
	
}
