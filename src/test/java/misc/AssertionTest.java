package misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//resources//chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
//		SoftAssert assertion = new SoftAssert();
//		assertion.assertEquals(driver.getTitle(), "Google1");	
		Assert.assertEquals(driver.getTitle(), "Google1");
		System.out.println(driver.getTitle());
		driver.close();
//		assertion.assertAll();
	}

}
