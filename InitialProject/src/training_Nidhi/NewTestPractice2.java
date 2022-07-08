package training_Nidhi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestPractice2 extends BaseClass {
	
  //MyPortal Functionality
	
	@Test(priority=1, groups= {"sanity","regression"})
  public void Loginmyportal() {
		driver.findElement(By.id("j_username")).sendKeys("devang@yopmail.com");	//Enter the username
		driver.findElement(By.id("j_password")).sendKeys("P@ssw0rd");//Enter the password
		
  }
	@Test(priority=2,groups= {"sanity","regression"})
	public void Submit()
	{
		
		driver.findElement(By.id("loginbtn")).click(); //Click on the Submit button
		
  }
	@Test(priority=3,groups= {"sanity","regression"})
	public void ProgramName()// Program Name in MyportalPage
	{
		driver.findElement(By.xpath("//h4[@class='panel-title']")).click();
WebElement Name= driver.findElement(By.xpath("//h4[@class='panel-title']"));
	System.out.println("The name of the list:"+Name.getAttribute("value"));
	System.out.println("The name of the list:"+Name.getText());
	Assert.assertEquals(Name," Program Name : SAT Group Class  -  Weekend SAT");
		
	
	
}
	@Test(priority=4)
	public void SatGroupClass()
	{
		
		driver.findElement(By.xpath("//a[@class='ng-binding ng-scope']")).click();// Click on  saturday group class 
		
		
		
		
	}
	//validation of table
	@Test(priority=5)
	public void TableData() throws InterruptedException
	{
		
	//	WebElement table = driver.findElement(By.xpath("//div[@class='table']"));
	//	System.out.println("The table is :"+table.getText());
	//int RSize = driver.findElements(By.xpath("//table[@id ='myTable']/tbody/tr")).size();
		//System.out.println("Rowsize is:"+RSize);
		//int Data = driver.findElements(By.xpath("//table[@id ='myTable']/tbody/tr/td")).size();
		//System.out.println("Size is:"+Data);	
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//table[@id ='myTable']//tbody//tr"));
		for(WebElement List: options)
		{
			String topics = List.getText();
			System.out.println(topics);
		}
		Thread.sleep(3000);
		
		
	}
}
	
	
	
	
	
	
	
	
	
