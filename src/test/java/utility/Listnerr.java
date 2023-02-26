package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClass.BaseClass;


public class Listnerr extends BaseClass implements ITestListener
{
	 public void onTestFailure(ITestResult result)
	 {
		Reporter.log("test case failed",true);
		try 
		{
			utilityy.screenshot(driver,result.getName());
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	 }
	
}
