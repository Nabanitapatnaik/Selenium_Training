package sdettestngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	@BeforeClass
	
	 public void beforeclass()
	  {
		  System.out.println("BeforeClass"); 
	  
	  }
	
	
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("BeforeMethod"); 
  
  }
	
	
	@Test
  public void test5() {
	  
	  System.out.println("Test1");
	  
	  }
  @Test
  public void test6() {
	  
	  System.out.println("Test2");
	  
	  }
 @ AfterMethod
 public void aftermethod()
 {
	  System.out.println("AfterMethod"); 
 
 }
 @AfterClass
	
 public void afterclass()
  {
	  System.out.println("AfterClass"); 
  
  }
@BeforeTest
 public void beforetest()
 {
	  System.out.println("BeforeTest"); 
 
 }
@AfterTest
public void aftertest()
{
	  System.out.println("afterTest"); 

}
 
 
 
  
}
