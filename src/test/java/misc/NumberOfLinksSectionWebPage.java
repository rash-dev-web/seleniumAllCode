package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberOfLinksSectionWebPage {
	
	WebDriver driver;

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement FooterElement = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		List<WebElement> footerLink = FooterElement.findElements(By.tagName("a"));
		System.out.println(footerLink.size());
		driver.close();
	}

}
