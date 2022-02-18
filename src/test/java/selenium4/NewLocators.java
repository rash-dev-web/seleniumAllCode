package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLocators {
	
	WebDriver driver;
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		driver.close();
	}

}
