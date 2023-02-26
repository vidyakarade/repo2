package mavenJuly23Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegesterFun 
{
	@FindBy(xpath="//a[text()='Register']")private WebElement register;
	@FindBy(id="gender-male")private WebElement redioButton;
	@FindBy(id="FirstName")private WebElement nameField;
	@FindBy(id="LastName")private WebElement lastName;
	@FindBy(id="Email")private WebElement email;
	@FindBy(id="Password")private WebElement password;
	@FindBy(id="ConfirmPassword")private WebElement pasword;
	@FindBy(xpath="//button[text()='Register']")private WebElement button;
	@FindBy(className="valid")private WebElement day;
	@FindBy(name="DateOfBirthMonth")private WebElement month;
	@FindBy(name="DateOfBirthYear")private WebElement year;
	public RegesterFun(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnRegester()
	{
		
		register.click();
		redioButton.click();
	}
	public void sendKey(String s )
	{		
		nameField.sendKeys(s);
	}
	public void sendKey1(String s)
	{		
		lastName.sendKeys(s);
	}
	public void sendKey2(String s)
	{		
		email.sendKeys(s);
	}
	public void sendKey3(String s)
	{		
		password.sendKeys(s);	
		pasword.sendKeys(s);	
		button.click();
	}
	public void SelectDate() throws InterruptedException
	{	{
		Thread.sleep(10000);
		Select s=new Select(day);
		s.selectByVisibleText("16");
		}
		Thread.sleep(1000);
		
		Select l= new Select(month);
		Thread.sleep(1000);
			l.selectByVisibleText("May");
		
		Select s=new Select(year);
		Thread.sleep(1000);
			s.selectByVisibleText("1992");
		
		
		
	}
}
	
	

