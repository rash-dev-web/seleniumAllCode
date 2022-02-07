package misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
	
	@FindBy(id="login")
	WebElement userId;
	
	@FindBy(how=How.ID, using="login")
	WebElement user_Id;
	
	HeadlessChrome signInPage = PageFactory.initElements(driver, HeadlessChrome.class);
	
	@Test
	public void test() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://testingalt.com");
		
		driver.close();
	
		
		
	}

}
