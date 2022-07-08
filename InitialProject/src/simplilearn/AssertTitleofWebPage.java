package simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTitleofWebPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String Title  =driver.getTitle();
		System.out.println(Title);
		if(Title.equalsIgnoreCase("Amazon.com. Spend less. Smile more."))
		{
			
			System.out.println("Test Case passed");
		}
		
		else
		{
			System.out.println("Test Case failed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
