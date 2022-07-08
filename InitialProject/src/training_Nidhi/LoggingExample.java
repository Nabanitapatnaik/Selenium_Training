package training_Nidhi;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoggingExample {
	public static WebDriver driver;
	public static Logger logger;
	@Test
	public void setup()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logger = Logger.getLogger("InitialProject");
		PropertyConfigurator.configure("Log4J.properties");
	    driver.get("https://www.javatpoint.com/");
		logger.info("URL is displayed");
		
		
	}
	
	
	
	
	
	
	
	
	

































@Test
  public void f() {
  }
}
