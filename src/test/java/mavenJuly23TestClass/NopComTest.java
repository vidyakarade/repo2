package mavenJuly23TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import mavenJuly23Pom.HomePage;
import mavenJuly23Pom.RegesterFun;
import utility.utilityy;

@Listeners(utility.Listnerr.class)

public class NopComTest extends BaseClass
{
	RegesterFun r;
	HomePage home;
	@BeforeClass
	public void lounchBrowser() throws IOException 
	{
		Reporter.log("lounching Browser",true);
		LounchBrowser(utilityy.readData("url"));
		r=new RegesterFun(driver);
		home=new HomePage(driver);
	}
	@BeforeMethod
	public void regeration() throws IOException, InterruptedException
	{
		Reporter.log("sending data in input fields",true);
		r.clickOnRegester();
		utilityy.waits(driver);
		Thread.sleep(2000);
		r.sendKey(utilityy.readData("fname"));
		Thread.sleep(2000);
		r.sendKey1(utilityy.readData("lname"));
		r.SelectDate();
		Thread.sleep(2000);
		r.sendKey2(utilityy.readData("emailid"));
		Thread.sleep(2000);
		utilityy.waits(driver);
		r.sendKey3(utilityy.readData("password"));
		Thread.sleep(2000);
	}
	@Test
	public void validateFun() throws IOException, InterruptedException 
	{
		Reporter.log("This is Test Class",true);
		String expectedResult="Your registration completed";
		Assert.assertEquals(expectedResult, home.validateRegistar(),"regestration is fail");
		utilityy.scrolling(driver, home.getelement());
		utilityy.screenshot(driver, expectedResult);
		Thread.sleep(1000);
	}
	@AfterMethod
	public void logOut()
	{
		Reporter.log("log out is running",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing browser",true);
		CloseBrowswe();
	}
	
	
}
