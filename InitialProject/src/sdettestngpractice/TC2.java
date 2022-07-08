package sdettestngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC2 {
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("Beforesuite");
	}
	@AfterSuite
	void aftersuite()
	{
		System.out.println("aftersuite");
	}
	
	
	
  @Test
  public void test7() {
	  
	  System.out.println("Test3");
	  
  }
  @Test
  public void test8() {
	  
	  System.out.println("Test4");
	  
  }
  @ AfterMethod
  public void aftermethod()
  {
 	  System.out.println("AfterMethodforTC2"); 
  
  }

  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("BeforeMethodTC2"); 
  
  }
	
  @BeforeClass
	
	 public void beforeclass()
	  {
		  System.out.println("BeforeClassTC2"); 
	  
	  }
  @AfterClass
	
  public void afterclass()
   {
 	  System.out.println("AfterClassTC2"); 
   
   }

  
}
