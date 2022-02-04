package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//resources//chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
////		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scroll(0, 600)");
		WebElement element = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		Thread.sleep(5000);
		driver.close();
	}
}
