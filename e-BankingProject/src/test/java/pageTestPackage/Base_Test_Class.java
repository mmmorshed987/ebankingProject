package pageTestPackage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilityPackage.ReadConfiq;

public class Base_Test_Class {
	ReadConfiq readconfiq = new ReadConfiq();		// its from Readconfiq class
	
	public String baseUrl = readconfiq.getApplicationURL();
	public String username= readconfiq.getUserName();
	public String password= readconfiq.getPassword();
	public static WebDriver driver;
	
	
	
	
	
	
	@BeforeClass
	public void setup()					// setup method for base class
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
	}

	@AfterClass
	public void tearDown() 			// tear down method for base class
	{
		driver.quit();
	}
}
