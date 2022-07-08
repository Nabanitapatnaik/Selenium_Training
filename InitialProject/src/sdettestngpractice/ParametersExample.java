package sdettestngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersExample {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void setUp(String Browser, String URL)
	{
		if(Browser.equalsIgnoreCase("chrome"))
			{
			WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		     }
		     else if(Browser.equalsIgnoreCase("firefox)"))
		     {
		    	 WebDriverManager.firefoxdriver().setup();
			     driver = new FirefoxDriver(); 
		     }
		driver.get(URL);
	}
	@Test
	public void logo()
	{
	WebElement logo = 	driver.findElement(By.id("divLogo"));
	Assert.assertTrue(logo.isDisplayed());
	
	}
	@Test
	public void homepagetitle()
	{
	String Title = driver.getTitle();
	Assert.assertEquals(Title,"OrangeHRM" );
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	

}
