package com.swaglabs.stepdef;

import com.swaglabs.pageobjects.CartPage;
import com.swaglabs.pageobjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RemoveItem {
    CartPage cartPage = new CartPage();

    @Given("clicks on remove button")
    public void clicks_on_remove_button() throws InterruptedException {
        cartPage.clicks_on_remove_button();
    }

    @Then("verifies that item is removed from cart")
    public void verifies_that_item_is_removed_from_cart() {
        cartPage.verifies_that_item_is_removed_from_cart();
    }
}
