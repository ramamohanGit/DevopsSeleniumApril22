package questionExample;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testNGExample.ChromeDriver;
import testNGExample.WebDriver;
import testNGExample.WebDriverManager;

public class GoogleSearchTest<WebElement> {

	WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.getClass("https://www.google.com/");
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
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("searchItemText");
		
		//1-approach
		//List <WebElement> buttonlist = driver.findElement(By.xpath("//input[@name='btnk']"));
		//buttonlist.get(1).click();
		
		//2-approach
		//using indexing findElement
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("searchItemText"+keys.ENTER);
		
		//3-approach
				//using keyboard opertaion
				driver.findElement(By.xpath("(//input[@name='btnk'])[2]")).click();
		
		//validation Step
		String actualTitle = driver.getTitle();
		System.out.println("Application Title after Search:" + actualTitle);
		Assert.assertTrue(actualTitle.contains(searchItemText));
	}
	
}
