package section11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//java//resources//chromedriver.exe");
		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));
		sel.selectByIndex(1);
		System.out.println(sel.getFirstSelectedOption().getText());
		List<WebElement> Elementlists = sel.getOptions();
		for(WebElement list: Elementlists) {
			System.out.println(list.getText());
		}
		
		System.out.println(sel.getOptions().size());
		
		System.out.println(sel.isMultiple());
		sel.deselectAll();
		
		
//		List<WebElement> allLinkes =  driver.findElements(By.tagName("a"));
//		System.out.println(allLinkes.size());
		driver.close();
	}
}
