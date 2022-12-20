package com.tutorialninja.cucumber.steps;

import com.tutorialninja.pages.LaptopsAndNotebooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @When("^Mouse hover on Laptops & NotebooksTabandclick$")
    public void mouseHoverOnLaptopsNotebooksTabandclick() {
        new LaptopsAndNotebooks().clickOnLaptoptopLink();
    }

    @And("^Click on Show All Laptops & Notebooks$")
    public void clickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooks().clickOnAllLaptopAndNotebooksLink();
    }

    @Then("^Select Sort By Price \\(High > Low\\)$")
    public void selectSortByPriceHighLow() {
        new LaptopsAndNotebooks().shortPriceLowToHigh();
    }

    @When("^Mouse hover on Laptops & NotebooksTabandclick(\\d+)$")
    public void mouseHoverOnLaptopsNotebooksTabandclick1() {
        new LaptopsAndNotebooks().clickOnLaptoptopLink();

    }

    @And("^Click on Show All Laptops & Notebooks(\\d+)$")
    public void clickOnShowAllLaptopsNotebooks1() {
        new LaptopsAndNotebooks().clickOnAllLaptopAndNotebooksLink();

    }

    @And("^Select Product MacBook$")
    public void selectProductMacBook() {
        new LaptopsAndNotebooks().clickOnMacbookLink();
    }

    @And("^Verify the text MacBook$")
    public void verifyTheTextMacBook() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyMacbook(),"MacBook","Error Message is not displayed");
    }

    @And("^Click on Add To Cart button$")
    public void clickOnAddToCartButton() {
        new LaptopsAndNotebooks().clickOnAddToCart();
    }

    @And("^Verify the message Success: You have added MacBook to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifySuccess(),"Success:You have added MacBook to your Shopping cart!\n" +
                "x","Error Message is not displayed");
    }

    @And("^Verify the text \"Shopping Cart$")
    public void verifyTheTextShoppingCart(){
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyCart(),"Shopping cart","Error Message is not displayed");
    }

    @And("^Verify the Product name \"MacBook$")
    public void verifyTheProductNameMacBook() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyProductMacbook(),"MacBook","Error Message is not displayed");
    }

    @And("^Change Quantity two$")
    public void changeQuantityTwo() {
        new LaptopsAndNotebooks().sendTextToQuantityField();
    }

    @And("^Click on Update Tab$")
    public void clickOnUpdateTab() {
        new LaptopsAndNotebooks().clickOnUpdateCart();
    }

    @And("^Verify the message Success: You have modified your shopping cart$")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyCarttext(),"Succcess: You have added Macbook to " +
                "your shopping cart!\n"+ "x","Error Message is not displayed");
    }

    @And("^Verify the Total$")
    public void verifyTheTotal() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyTotal(),"£1,472.45","Error message is not displayed");
    }

    @And("^Click on Checkout button$")
    public void clickOnCheckoutButton() {
        new LaptopsAndNotebooks().clickOnCheckout();
    }

    @And("^Verify the text Checkout$")
    public void verifyTheTextCheckout() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyCheckout(),"Checkout","Error is not displayed");
    }

    @And("^Verify the Text New Customer$")
    public void verifyTheTextNewCustomer() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyNewCustomer(),"New Customer","new customer ");
    }

    @And("^Click on Guest Checkout radio button$")
    public void clickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooks().clickOnGuestCheckout();
    }

    @And("^Click on Continue tab$")
    public void clickOnContinueTab() {
        new LaptopsAndNotebooks().clickOnContinueTab();
    }

    @And("^Click on Continue Button$")
    public void clickOnContinueButton() {
        new LaptopsAndNotebooks().clickContinue();
    }

    @And("^Add Comments About your order into text area$")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNotebooks().enterText("lovey day");
    }

    @And("^Check the Terms & Conditions check box$")
    public void checkTheTermsConditionsCheckBox() {
        new LaptopsAndNotebooks().clickOnTerms();
    }

    @And("^Click on Continue button$")
    public void clickOnContinueButton1() {
        new LaptopsAndNotebooks().clickContinue();
    }

    @Then("^Verify the message Warning: Payment method required$")
    public void verifyTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new LaptopsAndNotebooks().getVerifyWarningMsg(),
                "Warning: Payment method required!\n" +
                "×", "Error Message not displayed");
    }
}
