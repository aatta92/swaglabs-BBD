package com.swaglabs.stepdef;

import com.swaglabs.pageobjects.HomePage;
import io.cucumber.java.en.Then;

public class ProductInventoryStep {
    HomePage homePage = new HomePage();

    @Then("verify that product inventory page loads successfully")
    public void verify_that_product_inventory_page_loads_successfully() {
        homePage.verify_that_product_inventory_page_loads_successfully();
    }

}
