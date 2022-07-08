package sdettestngpractice;

import org.testng.annotations.Test;

public class Groupingexample {
	@Test(groups= {"sanity"})
	public void TestA()
	
	{
		System.out.println("A");
	}
	
	@Test(groups= {"sanity"})	
public void TestB()
	
	{
		System.out.println("B");
	}
	@Test(groups= {"regression"})
public void TestC()

{
	System.out.println("C");
}
	@Test(groups= {"regression"})
public void TestD()

{
	System.out.println("d");
}
	@Test(groups= {"regression","sanity"})
public void TestE()

{
	System.out.println("E");
}

	
	
	
	
	
	
	
	
	
}
