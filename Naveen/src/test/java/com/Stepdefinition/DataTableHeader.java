package com.Stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableHeader extends BaseClass {
	@Given("user want to login the adactin page")
	public void user_want_to_login_the_adactin_page() {
		LaunchBrowser();
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@When("user has to give below credentials")
	public void user_has_to_give_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		PageFactory.initElements(driver, LoginPom.class);
		List<Map<String,String>> asMaps = dataTable.asMaps();
		String uname = asMaps.get(0).get("username");
		String pword = asMaps.get(0).get("password");
		LoginPom.userName.sendKeys(uname);
		LoginPom.passWord.sendKeys(pword);
	}

	@Then("click the login button")
	public void click_the_login_button() {
	   LoginPom.login.click();
	   driver.close();
	}
}
