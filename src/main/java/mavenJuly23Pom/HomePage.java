package mavenJuly23Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//div[text()='Your registration completed']")private WebElement register;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public String validateRegistar()
	{
		return register.getText();
	}
	public WebElement getelement()
	{
		
		
		
		return register;
	}
	
}
