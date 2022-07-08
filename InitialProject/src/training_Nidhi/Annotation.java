package training_Nidhi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
	public void Testbeforeclass()
	{
		System.out.println("Before class");
		//Test for GITHUB PUSH
	}
	
	
	
	@BeforeMethod
	public void Testbeforemethod()
	{
		System.out.println("Before Method");
	}
@Test	
public void TestA()
{
	System.out.println("TestA");
}
	@Test
public void TestB()
{
	System.out.println("TestB");
}
	@AfterMethod
	public void Testaftermethod()
	{
		System.out.println("Aftermethod");
	}		
	@AfterClass
	public void Testafterclass()
	{
		System.out.println("Afterclass");
	}		
	
	
	
	
	
	
	
	
	
}
