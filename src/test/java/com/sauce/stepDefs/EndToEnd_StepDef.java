package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductsPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EndToEnd_StepDef {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should be able to see {string} header")
    public void theUserShouldBeAbleToSeeHeader(String expectedHeader) {
        assertEquals(expectedHeader,productsPage.productsText.getText());
    }

    @And("The user adds the as {string} and {string} product")
    public void the_user_adds_the_as_and_product(String product1, String product2) {
        productsPage.addProduct(product1);
        productsPage.addProduct(product2);
    }

    @And("The user opens basket")
    public void theUserOpensBasket() {
        productsPage.cartBtn.click();
    }

    @And("The user clicks on checkout")
    public void theUserClicksOnCheckout() {
        cartPage.checkoutBtn.click();
    }

    @And("The user enters details as {string} and {string} and {string}")
    public void theUserEntersDetailsAsAndAnd(String firstname, String lastname, String zipCode) {
        checkoutPage.enterDetails(firstname, lastname, zipCode);
    }

    @Then("The user verifies that the price is {string}")
    public void theUserVerifiesThatThePriceIs(String expectedTotal) {
        assertEquals(expectedTotal,checkoutPage.summaryTotal.getText());
    }

    @And("The user clicks on finish button")
    public void theUserClicksOnFinishButton() {
        checkoutPage.finishBtn.click();
    }

    @Then("The user should be able to see confirmation message as {string}")
    public void theUserShouldBeAbleToSeeConfirmationMessageAs(String expectedMessage) {
        assertEquals(expectedMessage,checkoutPage.thanksMsg.getText());
    }
}