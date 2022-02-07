package misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://testingalt.com");
		driver.navigate().refresh();
		driver.get("https://testingalt.com");
		driver.navigate().to("https://testingalt.com");
		driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@title='TestingAlt']")).sendKeys(Keys.F5);
		driver.close();
	}

}
