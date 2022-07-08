package training_Nidhi;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidereg2 extends BaseClass {

	@DataProvider(name = "dataprovider")
	public Object[][] dpmethod() {
		Object[][] data = { { "devang@yopmail.com", "P@ssw0rd" }, { "def@gmail.com", "def123" } };
		return data;

	}

	@Test(dataProvider = "dataprovider")
	public void LoginTest(String Email, String Password) {

		driver.findElement(By.id("j_username")).sendKeys(Email); // Enter the username
		driver.findElement(By.id("j_password")).sendKeys(Password);// Enter the password

	}

	@Test
	public void Submit() {

		driver.findElement(By.id("loginbtn")).click(); // Click on the Submit button

	}

}
