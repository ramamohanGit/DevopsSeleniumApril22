package testNGExample;

public class BaseTest {
	
	WebDriver driver;
	
	public void lgaunchApp{String tcs_browser}
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver():
		
	}
	
	elseif{tcs_broser.equalsIgnoreCase("edge")}{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	else {
		
		//Default browser
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		@AfterTest
	}

}
