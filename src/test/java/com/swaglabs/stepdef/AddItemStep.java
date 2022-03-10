package com.swaglabs.stepdef;

import com.swaglabs.pageobjects.CartPage;
import com.swaglabs.pageobjects.HomePage;
import io.cucumber.java.en.Then;

public class AddItemStep {
    CartPage cartPage = new CartPage();

    @Then("verifies that item is added successfully")
    public void verifies_that_item_is_added_successfully() {
        cartPage.verifies_that_item_is_added_successfully();
    }
}
