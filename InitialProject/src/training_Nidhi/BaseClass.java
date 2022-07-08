package training_Nidhi;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	  @BeforeClass
		public void setUp()
		{
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		driver.get("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	  
	  @AfterClass
		public void teardown()
		{
		
		
		driver.close();
		
		
		
		
		}
	  
	  
	  
}
