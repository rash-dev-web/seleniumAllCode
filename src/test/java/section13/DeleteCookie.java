package section13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookie {
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("session");
		driver.get("https://testingalt.com");
		driver.close();
		
		String str = "abs";
		str.sub
		
		
	}

}
