package section5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdNameLocators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//resources//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("userEmail")).sendKeys("Mir");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Ayan");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("QWE");
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		
		WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", links);
		
		driver.findElement(By.xpath("//span[text()='Links']")).click();
		driver.findElement(By.partialLinkText("Home")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
