package com.Stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLogin extends BaseClass{

	@Given("user has to go to login page")
	public void user_has_to_go_to_login_page() {
		LaunchBrowser();
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@When("user has to give input in username")
	public void user_has_to_give_input_in_username() throws IOException {
		PageFactory.initElements(driver, LoginPom.class);
		FileInputStream fis=new FileInputStream("C:\\Users\\Ganesh\\eclipse-workspace\\Automation\\Naveen\\src\\main\\java\\com\\POMClass\\AdactinCredential.properties");
		Properties p=new Properties();
		p.load(fis);
		LoginPom.userName.sendKeys(p.getProperty("uname"));
		
	}

	@When("user has to give input in password")
	public void user_has_to_give_input_in_password() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Ganesh\\eclipse-workspace\\Automation\\Naveen\\src\\main\\java\\com\\POMClass\\AdactinCredential.properties");
		Properties p=new Properties();
		p.load(fis);
		LoginPom.passWord.sendKeys(p.getProperty("pword"));
	
	}

	@Then("user want to click login button")
	public void user_want_to_click_login_button() {
		LoginPom.login.click();
	}
	
}
