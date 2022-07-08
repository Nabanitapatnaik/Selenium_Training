package testNG;

import org.testng.annotations.Test;

public class Demo5 {
  @Test(dependsOnMethods= {"TstB"})
  public void TstA()
  {
	  
	System.out.println("A");  
	  
  } 
	
  @Test
  public void TstB()
  {
	  
	System.out.println("B");  
	  
  } 
  @Test(priority=1)
  public void TstC()
  {
	  
	System.out.println("C");  
	  
  } 
  @Test
  public void TstD()
  {
	  
	System.out.println("D");  
	  
  } 
  
  @Test(priority=2)
  public void TstE()
  {
	  
	System.out.println("E");  
	  
  } 
  
  
  
	  
  
}
