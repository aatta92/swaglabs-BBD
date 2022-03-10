package com.swaglabs.stepdef;

import com.swaglabs.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.swaglabs.base.BaseClass.driver;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Given("user is on webpage")
    public void user_is_on_webpage() {
        driver.get("https://www.saucedemo.com/");
    }

    @Given("enters valid username and password")
    public void enters_valid_username_and_password() {
        loginPage.enters_valid_username_and_password("standard_user", "secret_sauce");

    }

    @Given("clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
        loginPage.clicks_on_login_button();
    }

    @Then("verifies that you logged in successfully")
    public void verifies_that_you_logged_in_successfully() {
        loginPage.verifies_that_you_logged_in_successfully();
    }
}
