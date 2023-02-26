package utility;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class utilityy 
{
	public static void waits(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public static void screenshot(WebDriver driver,String s) throws IOException
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File f=t.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\DELL\\Pictures\\Screenshots"+s+".png");
		FileHandler.copy(f,target);
	}
	public static void scrolling(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)",ele);
		
	}
	public static String  readData(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\mavenJuly23\\mavenpro.properties");
		pro.load(file);
		return pro.getProperty(key);
	}

}
