package com.swaglabs.pageobjects;

import com.swaglabs.base.BaseClass;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(css = "[src='/static/media/sauce-backpack-1200x1500.34e7aa42.jpg']")
    WebElement product_image;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement add_itemBtn;

    @FindBy(css = "[class='shopping_cart_badge']")
    WebElement cart_headerLink;

    @FindBy(css = "#checkout")
    WebElement checkoutBtn;

    @FindBy(css = "#first-name")
    WebElement firstname_field;

    @FindBy(css = "#last-name")
    WebElement lastname_field;

    @FindBy(css = "#postal-code")
    WebElement zipcode_field;

    @FindBy(css = "#continue")
    WebElement continue_btn;

    @FindBy(css = "#finish")
    WebElement finishBtn;

    @FindBy(css = ".complete-text")
    WebElement complete_text;

    @FindBy(css = ".cart_item")
    WebElement cart_added_item;

    @FindBy(css = "#remove-sauce-labs-backpack")
    WebElement removeBtn;

    @FindBy(css = "#contents_wrapper")
    WebElement removed_item;


    public void verify_that_product_inventory_page_loads_successfully() {
        String src = product_image.getAttribute("src");
        System.out.println(src);
        Assert.assertFalse(src.isEmpty());
    }

    public void adds_and_item() throws InterruptedException {
        add_itemBtn.click();
        Thread.sleep(1000);
    }

    public void clicks_on_cart_header_link() throws InterruptedException {
        cart_headerLink.click();
        Thread.sleep(1000);
    }

//    public void clicks_on_checkout_button() throws InterruptedException {
//        checkoutBtn.click();
//        Thread.sleep(1000);
//    }

//    public void fills_out_fields_with_valid_data(String fname, String lname, String zipcode) {
//        firstname_field.sendKeys(fname);
//        lastname_field.sendKeys(lname);
//        zipcode_field.sendKeys(zipcode);
//    }
//
//    public void clicks_on_continue_button() throws InterruptedException {
//        continue_btn.click();
//        Thread.sleep(1000);
//    }
//
//    public void clicks_on_finish_button() throws InterruptedException {
//        finishBtn.click();
//        Thread.sleep(1000);
//    }
//
//    public void verifies_that_order_has_been_placed_successfully() {
//        String text = complete_text.getText();
//        System.out.println(text);
//        Assert.assertFalse(text.isEmpty());
//
//    }
//
//    public void verifies_that_item_is_added_successfully() {
//        String text = cart_added_item.getText();
//        System.out.println(text);
//        Assert.assertFalse(text.isEmpty());
//    }
//
//    public void clicks_on_remove_button() throws InterruptedException {
//        removeBtn.click();
//        Thread.sleep(1000);
//    }
//
//    public void verifies_that_item_is_removed_from_cart() {
//        String text = removed_item.getText();
//        System.out.println(text);
//        Assert.assertFalse(text.contains("Sauce Labs Backpack"));
//    }
}
