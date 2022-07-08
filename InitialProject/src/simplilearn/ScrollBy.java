package simplilearn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// JavaScriptObject
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//URL
		driver.get("https://www.amazon.com/");
		//Scroll down to desired location
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
