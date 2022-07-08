package sdettestngpractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Parameters({"Data"})
	@Test
	public void Testing1(String S)
		{
		System.out.println(S);
		
	}
	
}
