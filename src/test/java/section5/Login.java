package section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import constants.Constants;

public class Login {

	@Test
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("(//input[@id='inputUsername'])[1]")).sendKeys(Constants.username);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(Constants.password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
