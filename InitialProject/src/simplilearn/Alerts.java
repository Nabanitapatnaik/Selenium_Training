package simplilearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Alert with only OK button

		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; driver.switchTo().alert().accept();//Closing alert by OK
		 */

		// Alert with Ok and Cancel Button

		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); //driver.switchTo().alert().accept();//Closing alert by OK
		 * Thread.sleep(2000); driver.switchTo().alert().dismiss();//Closing Alert by
		 * Cancel
		 */

		// Alert with input box and capture text from alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText();
		System.out.println(Text);
		alert.sendKeys("Welcome");
		alert.accept();

	}

}
