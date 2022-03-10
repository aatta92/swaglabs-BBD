package com.swaglabs.stepdef;

import com.swaglabs.pageobjects.CartPage;
import com.swaglabs.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PlaceOrderStep {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @Given("adds and item")
    public void adds_and_item() throws InterruptedException {
        homePage.adds_and_item();
    }

    @Given("clicks on cart header link")
    public void clicks_on_cart_header_link() throws InterruptedException {
        homePage.clicks_on_cart_header_link();
    }

    @Given("clicks on checkout button")
    public void clicks_on_checkout_button() throws InterruptedException {
        cartPage.clicks_on_checkout_button();
    }

    @Given("fills out fields with valid data")
    public void fills_out_fields_with_valid_data() {
        cartPage.fills_out_fields_with_valid_data("anwar", "atta", "20155");
    }

    @Given("clicks on continue button")
    public void clicks_on_continue_button() throws InterruptedException {
        cartPage.clicks_on_continue_button();
    }

    @Given("clicks on finish button")
    public void clicks_on_finish_button() throws InterruptedException {
        cartPage.clicks_on_finish_button();
    }

    @Then("verifies that order has been placed successfully")
    public void verifies_that_order_has_been_placed_successfully() {
        cartPage.verifies_that_order_has_been_placed_successfully();
    }

}
