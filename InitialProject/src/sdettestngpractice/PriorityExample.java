package sdettestngpractice;

import org.testng.annotations.Test;

public class PriorityExample {
@Test(priority =1 ,dependsOnMethods= {"Testtwo"})
	void Testone()
	{
		System.out.println("Testone");
	}
	
@Test(priority=2)
	void Testtwo()
	{
		System.out.println("Testtwo");
	}
	
@Test(priority=3, enabled=false) //known defect

	void Testthree()
	{
		System.out.println("Testthree");
	}
@Test(priority=4)
	void Testfour()
	{
		System.out.println("Testfour");
	}
	
	
	
	
	
}
