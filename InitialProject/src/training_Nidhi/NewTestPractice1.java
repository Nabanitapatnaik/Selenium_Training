package training_Nidhi;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestPractice1 extends BaseClass {
	// Checking Login Functionality

	@Test(groups = { "sanity" })
	@Parameters({"email", "password"})
	public void Login(String Email, String Password) {
		driver.findElement(By.id("j_username")).sendKeys(Email); // Enter the username
		driver.findElement(By.id("j_password")).sendKeys(Password);// Enter the password
		System.out.println("The title is:" + driver.getTitle());
		if (driver.getTitle().equalsIgnoreCase("Ramana Coaching Center")) {

			Assert.assertTrue(true);
			System.out.println("Test Case passed");

		} else

		{

			Assert.assertTrue(false);
			System.out.println("Test Case failed");

		}
	}

	@Test(dependsOnMethods = { "Login" }, groups = { "sanity" })
	public void Submit() {

		driver.findElement(By.id("loginbtn")).click();

	}

}
