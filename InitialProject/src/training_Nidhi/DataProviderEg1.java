package training_Nidhi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEg1 {
	
	@DataProvider(name = "dataprovider")
	public Object[][] dp()
	{
		
	return new Object[][] {{"value1"}, {"value2"}}	;
		
	}
	
	
	
	
	
	
	@Test(dataProvider = "dataprovider")
	public void myTest(String A)
	{
		System.out.println(A);
		
		
		
	}
	
	
	
	
	
	
	

}
