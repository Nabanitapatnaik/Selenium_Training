package sdettestngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionsexamples {
	
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void logo()
	{
	WebElement logo = 	driver.findElement(By.id("divLogo"));
	Assert.assertFalse(logo.isDisplayed());
	
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
