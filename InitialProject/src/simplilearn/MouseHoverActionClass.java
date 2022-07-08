package simplilearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 Actions act = new Actions(driver);
	WebElement links = driver.findElement(By.linkText("Today's Deals"));
	//act.moveToElement(links).build().perform();//MovetoElement
	act.doubleClick(links).build().perform();//doubleclick
	
	List<WebElement> list = driver.findElements(By.tagName("a"));
		int size = list.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
