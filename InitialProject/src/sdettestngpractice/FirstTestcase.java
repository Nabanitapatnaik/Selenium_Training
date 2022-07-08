package sdettestngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestcase {
	
@Test(priority=1)	
 public void setup()
 
 
 {
	 System.out.println("Opening Browser");
	 
 }
	@Test(priority=2)	
 public void login()
	
 {
		 System.out.println("Login Test");
}
 @Test(priority=3)	
 void teardown()
 
 {
	 System.out.println("closing browser");
 }
 
 
}