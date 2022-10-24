package pageTestPackage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilityPackage.ReadConfiq;

public class Base_Test_Class {
	ReadConfiq readconfiq = new ReadConfiq();		// its from Readconfiq class
	
	public String baseUrl = readconfiq.getApplicationURL();
	public String username= readconfiq.getUserName();
	public String password= readconfiq.getPassword();
	public static WebDriver driver;
	
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)					// setup method for base class
	{
	if(br.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		}
	else if(br.equals("firefox"))
	{
		WebDriverManager.firefoxdriver();
	}
	else if (br.equals("ie")) {
		WebDriverManager.iedriver();
	}
	driver.get(baseUrl);
	
	
	
	
	}
	
		
	@AfterClass
	public void tearDown() 			// tear down method for base class
	{
		driver.quit();
	}
}
