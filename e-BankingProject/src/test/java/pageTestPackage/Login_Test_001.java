package pageTestPackage;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagePackage.Login_page;

public class Login_Test_001 extends Base_Test_Class{

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		Login_page lp = new Login_page(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
	//if(driver.getTitle().equals("Guru99 Bank Home Page")) {
		System.out.println("title is ok");
		
		//Assert.assertTrue(true);
		//}
//	else {
		//Assert.assertTrue(false);
		System.out.println("title is not ok");
	//}
		
		
	}
	
}
