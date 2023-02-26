package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{	protected static WebDriver driver;
	public void LounchBrowser(String s)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);	
			
	}
	public void CloseBrowswe()
	{	
		
		
		
				driver.close();
	}

}
