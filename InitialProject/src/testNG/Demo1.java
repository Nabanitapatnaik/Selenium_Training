package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class Demo1 {
	@BeforeClass
	public void BeforeTest()
	{
		System.out.println("Execute this test first always");
	}
	
	
	

@Test
	public void test1()
	{
	System.out.println("First Test case");
		
	}
@Test(groups= {"smoke"})
public void test2()
{
System.out.println("Second Test case");
	
}

@AfterClass
public void AfterTest()
{
System.out.println("execute this after the test");
	
}



}
