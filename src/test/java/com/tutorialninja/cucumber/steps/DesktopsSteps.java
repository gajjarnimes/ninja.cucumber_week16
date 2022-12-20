package com.tutorialninja.cucumber.steps;

import com.tutorialninja.pages.Desktops;
import com.tutorialninja.pages.Homepage;
import com.tutorialninja.pages.LaptopsAndNotebooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopsSteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^Click on currency link$")
    public void clickOnCurrencyLink() {
        new Desktops().clickOnCurrencyLink();
    }

    @And("^chane currency to pound$")
    public void chaneCurrencyToPound() {
        new LaptopsAndNotebooks().changeCurrency();
    }

    @And("^Mouse hover on Desktops Tab and click$")
    public void mouseHoverOnDesktopsTabAndClick() {
        new Homepage().clickOnDesktopLink();
    }

    @And("^Click on Show All Desktops$")
    public void clickOnShowAllDesktops() {
        new Desktops().clickOnAllDesktop();
    }

    @And("^Select Sort By position Name A to Z$")
    public void selectSortByPositionNameAToZ() {
        new Desktops().SortByNameZtoAfromDropdown();
    }

    @And("^Select product HP LP(\\d+)$")
    public void selectProductHPLP(int arg0) {
        new Desktops().clickOnHPlp3065();
    }

    @And("^Verify the Text HP LP(\\d+)$")
    public void verifyTheTextHPLP(int arg0) {
        Assert.assertEquals(new Desktops().getVerifyTextHp(),"HP LP3065","Error Message is not displayed");
    }

    @And("^Select Delivery Date (\\d+)-(\\d+)-(\\d+)$")
    public void selectDeliveryDate() {
        new Desktops().selectDeliveryDate();
    }

    @And("^Click on Add to Cart button$")
    public void clickOnAddToCartButton() {
        new Desktops().clickOnAdToCart();
    }

    @And("^Verify the Message Success: You have added HP LP(\\d+) to your shopping cart$")
    public void verifyTheMessageSuccessYouHaveAddedHPLPToYourShoppingCart() {
        Assert.assertEquals(new Desktops().getVerifyMessage(),"Success:You have added HP LP3065 to your shopping cart!\n"+ "x","Error Message is not Displayed");
    }

    @And("^Click on link shopping cart display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new Desktops().clickOnShppingCart();
    }

    @And("^Verify the text Shopping Cart$")
    public void verifyTheTextShoppingCart() {
        Assert.assertEquals(new Desktops().getVerifyShoppingCart(),"Shopping Cart(1.00Kg)","Error is not displayed");
    }

    @And("^Verify the Product name HP LP(\\d+)$")
    public void verifyTheProductNameHPLP() {
        Assert.assertEquals(new Desktops().getVerifyProductName(),"HP LP3065","Error message is not displayed");
    }

    @And("^Verify the Model Product(\\d+)$")
    public void verifyTheModelProduct(int arg0) {
        Assert.assertEquals(new Desktops().getVerifyModel(),"Product 21","Error message is not displayed");
    }

    @Then("^Verify the Total £(\\d+)\\.(\\d+)$")
    public void verifyTheTotal£(int arg0, int arg1) {
        Assert.assertEquals(new Desktops().getVerifyTotal(),"74.73","Error message is not displayed");
    }
}
