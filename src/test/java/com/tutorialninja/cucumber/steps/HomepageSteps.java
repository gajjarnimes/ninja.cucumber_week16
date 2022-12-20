package com.tutorialninja.cucumber.steps;

import com.tutorialninja.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomepageSteps {
    @When("^Mouse hover on “Desktops” Tab and click$")
    public void mouseHoverOnDesktopsTabAndClick() {
        new Homepage().clickOnDesktopLink();
    }

    @And("^call selectMenu method and pass the menu = Show All Desktops$")
    public void callSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new Homepage().selectMenu("Show All Desktops");
    }

    @Then("^Verify the text ‘Desktops’$")
    public void verifyTheTextDesktops() {
        Assert.assertEquals(new Homepage().getVerifyText(),"Desktops","Error message is not displayed");
    }

    @When("^Mouse hover on “Laptops & Notebooks” Tab and click$")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new Homepage().clickOnLaptopNotebooksLink();
    }

    @And("^call selectMenu method and pass the menu = Show All Laptops & Notebooks$")
    public void callSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new Homepage().selectMenu("Show All Laptops & Notebooks");
    }

    @Then("^Verify the text ‘Laptops & Notebooks’$")
    public void verifyTheTextLaptopsNotebooks() {
        Assert.assertEquals(new Homepage().getVerifyText1(),"Laptops & Notebooks","Error message is not displayed");
    }

    @When("^Mouse hover on “Components” Tab and click$")
    public void mouseHoverOnComponentsTabAndClick() {
        new Homepage().clickOnComponantsLink();
    }

    @And("^call selectMenu method and pass the menu = Show All Components$")
    public void callSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new Homepage().selectMenu("Show All Component");
    }

    @Then("^Verify the text ‘Components’$")
    public void verifyTheTextComponents() {
        Assert.assertEquals(new Homepage().getVerifyText2(),"Components","Error message is not displayed");
    }
}
