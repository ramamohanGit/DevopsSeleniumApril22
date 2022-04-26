package questionExample;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNGExample.ChromeDriver;
import testNGExample.WebDriver;
import testNGExample.WebDriverManager;

public class AmazonSearchTest<WebElement> {

	WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.getClass("https://www.amzon.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeApp() {
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	@Test
	public void SearchItems(Object By) {
		
		String searchItemText = "iphone";
		//enter value on searchbox
		driver.findElement(By.xpath("")).sendKeys("searchItemText");
		
		//click on search button
		driver.findElement(By.xpath("//input[contains(@value,'Go)]"))
		
		//validation Step
		String actualTitle = driver.getTitle();
		System.out.println("Application Title after Search:" + actualTitle);
		Assert.assertTrue(actualTitle.contains(searchItemText));
	}
	
}
