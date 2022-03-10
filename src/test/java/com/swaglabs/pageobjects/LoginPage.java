package com.swaglabs.pageobjects;

import com.swaglabs.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(css = "#user-name")
    WebElement username_textFiled;

    @FindBy(css = "#password")
    WebElement password_textField;

    @FindBy(css = "#login-button")
    WebElement login_button;

    @FindBy(css = "[class='title']")
    WebElement logo;

    public void enters_valid_username_and_password(String username, String password) {
        username_textFiled.sendKeys(username);
        password_textField.sendKeys(password);
    }

    public void clicks_on_login_button() throws InterruptedException {
        login_button.click();
        Thread.sleep(1000);
    }

    public void verifies_that_you_logged_in_successfully() {
        String text = logo.getText();
        Assert.assertTrue(text.contains("PRODUCTS"));
    }
}
