package com.Stepdefinition;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTable extends BaseClass{
	@Given("user has to login the page")
	public void user_has_to_login_the_page() {
		LaunchBrowser();
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@When("user has to pass below username and password")
	public void user_has_to_pass_below_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		PageFactory.initElements(driver, LoginPom.class);
		List<List<String>> asLists = dataTable.asLists();
		String uname = asLists.get(0).get(0);
		String pword = asLists.get(0).get(1);
		
		LoginPom.userName.sendKeys(uname);
		LoginPom.passWord.sendKeys(pword);
		
	}

	@Then("click login button")
	public void click_login_button() {
		LoginPom.login.click();
	}
}
