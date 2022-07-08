package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void webloginCarLoan()
	{
	System.out.println("Selenium");
		
	}
@Test
public void mobileloginCarLoan()
{
System.out.println("Appium");
}
@Test
public void mobileloginCarLoan1()
{
System.out.println("Appium1");
	
}
@Test
public void mobileloginCarLoan2()
{
System.out.println("Appium2");
	
}


@Test
public void loginApICarLoan()
{
System.out.println("RestApI");
	
}
@BeforeSuite
public void Beforesuite()
{
System.out.println("WELCOME");
	
}		
@AfterSuite
public void Aftersuite()
{
System.out.println("Bye");
	
}	
	
	
	
	
	
	
}
