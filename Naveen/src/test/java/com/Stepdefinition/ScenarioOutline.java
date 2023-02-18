package com.Stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline extends BaseClass{
	@Given("user go to login page")
	public void user_go_to_login_page() {
		LaunchBrowser();
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@When("user want to pass {string} and {string}")
	public void user_want_to_pass_and(String uname, String pword) {
		PageFactory.initElements(driver, LoginPom.class);
		LoginPom.userName.sendKeys(uname);
		LoginPom.passWord.sendKeys(pword);
	}

	@Then("click login")
	public void click_login() {
		LoginPom.login .click();
	}


}
