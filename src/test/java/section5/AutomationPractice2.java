package section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPractice2 {

	@Test
	public void testLocators() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//click radio button
		radioButtonClick(driver);
		
		//click checkbox 
		clickCheckBox(driver);
		
		Thread.sleep(3000);
		driver.quit();
	}

	private void clickCheckBox(WebDriver driver) {
		driver.findElement(By.cssSelector("#checkBoxOption3")).click();
		
	}

	private void radioButtonClick(WebDriver driver) {
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		
	}

}
