package sdettestngpractice;

import org.testng.annotations.Test;

public class SecondTestCase {
	@Test(priority=1)	
	 public void setup()
	 
	 
	 {
		 System.out.println("Opening Browser again");
		 
	 }
		@Test(priority=3)	
	 public void searchCustomer()
		
	 {
			 System.out.println("Search for Customer");
	}
		@Test(priority=2)	
		 public void addCustomer()
			
		 {
				 System.out.println("Add a Customer");
		}
		
		
		
		
		
		
		
		
		
	 @Test(priority=3)	
	 void teardown()
	 
	 {
		 System.out.println("closing browseragain");
	 }
	 
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

