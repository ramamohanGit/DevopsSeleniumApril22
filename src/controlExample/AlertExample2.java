package controlExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import testNGExample.ChromeDriver;
import testNGExample.WebDriver;

public class AlertExample2 {
	
	WebDriver driver;
	
  @BeforeTest
  public void launchApp() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.uitestpractice.com/Students/Switchto");
	  driver.manager().window().maximize();
	 
  }
  
  @AfterTest
  public void PromptAlert() {
	  Thread.sleep(4000);
	  driver.close();
  }
  
  @Test
  public void PromptAlert1() throws Exception {
	  Thread.sleep(4000);
	  driver.
	  
	  //Alert/window/frame----driver--->switchTo
	  
	  //handlealert
	  Alert prompt = driver.switchTo().alert();
	  
	  Thread.sleep(4000);
	  
	  System.out.println(prompt.getText());
	  
	  String name='Raj';
	  prompt.sendKeys(name);
	  
	  prompt.accept();
	  
	  String value=driver.
  }

}
