package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement usernamel;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordl;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginbtnl;
	
	@FindBy(xpath="//p[text()='DenzelTest 17 Washington']")
	WebElement profilebtnl;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutbtnl;
	
	public void EnterUsername(String username)
	
	{
		usernamel.clear();
		usernamel.sendKeys(username);
		
	}
	public void EnterPassword(String password)
	{
		passwordl.clear();
		passwordl.sendKeys(password);
	}
	public void clickonloginbtn()
	{
		loginbtnl.click();
	}
	public void clickonprofile()
	{
		profilebtnl.click();
	}
	public void clickonlogoutbtn()
	{
		logoutbtnl.click();
	}

}
