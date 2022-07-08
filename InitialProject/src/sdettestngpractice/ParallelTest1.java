package sdettestngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {
	WebDriver driver;
	
@Test
	public void logoTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement logo = 	driver.findElement(By.id("divLogo"));
	boolean lo = logo.isDisplayed();
	Assert.assertTrue(lo);
	Thread.sleep(2000);
	}
	
@Test	
	public void titleTest()
	{

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String title = driver.getTitle()	;
	Assert.assertEquals(title, "OrangeHRM");
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	}
	
	
	
	

