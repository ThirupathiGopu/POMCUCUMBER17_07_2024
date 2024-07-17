package stepDefinations;

import org.openqa.selenium.WebDriver;

import com.Utilities.Browser;
import com.Utilities.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Loginpage;

public class Steps 
{
	WebDriver driver;
	Loginpage login;
	PropertyReader reader;
	@Given("lanch chrome browser")
	public void lanch_chrome_browser() throws Exception
	{
		reader=new PropertyReader("browserdetails");
		driver=Browser.labchbrowser(reader.GetData("browser"));
	   
	}

	@Then("Enter url{string}")
	public void enter_url(String url) 
	{
		driver=Browser.Enteurl(reader.GetData("url"));
		//Browser.Enteurl(url);
	}
	

	@Then("Enter user name {string}")
	public void enter_user_name(String username) {
	    login=new Loginpage(driver);
	    login.EnterUsername(username);
	}
	

	@Then("Enter password{string}")
	public void enter_password(String password) 
	{
	    //login.EnterPassword(reader.GetData("password"));
		login.EnterPassword(password);
	}

	@Then("click on login button")
	public void click_on_login_button() 
	{
		login.clickonloginbtn();
	    
	}

	@Then("click on profile button")
	public void click_on_profile_button() 
	{
		login.clickonprofile();  
	}
	
	@Then("click on Logout button")
	public void click_on_logout_button() 
	{
		login.clickonlogoutbtn();
	   
	}

	@Then("Close broswer")
	public void close_broswer() 
	{
	    
	}

}


/*
 * @Then("Enter url {string}")
public void enter_url(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Enter user name\"Admin\"")
public void enter_user_name_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("click on profie button")
public void click_on_profie_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("close broswer")
public void close_broswer() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Enter user name\"admin\"")
public void enter_user_name_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
 @Then("Enter url\"https:\\/\\/opensource-demo.orangehrmlive.coms\"")
public void enter_url_https_opensource_demo_orangehrmlive_coms() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Enter user name {string}")
public void enter_user_name(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("click on profile button")
public void click_on_profile_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


 */
