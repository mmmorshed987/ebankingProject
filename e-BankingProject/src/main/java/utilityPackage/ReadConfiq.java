package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiq {
	
	Properties pro;
	
	public ReadConfiq()
	{
		File src = new File("C:\\Users\\mmmor\\eclipse-workspace\\e-BankingProject\\src\\main\\java\\propertyPackage\\confiq.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			}catch (Exception e) {
				System.out.println("exception is "+e.getMessage());
			}
	}
		
	public String getApplicationURL() 
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName() {
		String Username = pro.getProperty("username");
		return Username;
	}
		
	public String getPassword() {
		String Password = pro.getProperty("password");
		return Password;
	}
		


}
