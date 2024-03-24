package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductsPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EndToEnd_StepDef {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("Der Benutzer befindet sich auf der Anmeldeseite")
    public void der_benutzer_befindet_sich_auf_der_anmeldeseite()  {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("Der Benutzer {string} und {string} eingibt")
    public void der_benutzer_und_eingibt(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("Der Benutzer sollte  in der Lage sein, die Kopfzeile {string} zu sehen")
    public void der_benutzer_sollte_in_der_lage_sein_die_kopfzeile_zu_sehen(String expectedHeader) {
        assertEquals(expectedHeader,productsPage.productsText.getText());
    }

    @Then("Der Benutzer fügt die Produkte {string} und {string} hinzu")
    public void der_benutzer_fügt_die_produkte_und_hinzu(String product1, String product2) {
        productsPage.addProduct(product1);
        productsPage.addProduct(product2);
    }

    @Then("Der Benutzer öffnet den Warenkorb")
    public void der_benutzer_öffnet_den_warenkorb() {
        productsPage.cartBtn.click();
    }

    @Then("Der Benutzer klickt auf \"Zur Kasse gehen")
    public void der_benutzer_klickt_auf_zur_kasse_gehen() {
        cartPage.checkoutBtn.click();
    }

    @Then("Der Benutzer gibt die Daten {string} und {string} und {string} ein")
    public void der_benutzer_gibt_die_daten_und_und_ein(String firstname, String lastname, String zipCode) {
        checkoutPage.enterDetails(firstname, lastname, zipCode);
    }

    @Then("Der Benutzer überprüft, dass der Preis {string} ist")
    public void der_benutzer_überprüft_dass_der_preis_ist(String expectedTotal) {
        assertEquals(expectedTotal,checkoutPage.summaryTotal.getText());
    }

    @Then("Der Benutzer klickt auf die Schaltfläche \"Finish")
    public void der_benutzer_klickt_auf_die_schaltfläche_finish() {
        checkoutPage.finishBtn.click();
    }

    @Then("Der Benutzer sollte in der Lage sein, eine Bestätigungsnachricht wie {string} zu sehen.")
    public void der_benutzer_sollte_in_der_lage_sein_eine_bestätigungsnachricht_wie_zu_sehen(String expectedMessage) {
        assertEquals(expectedMessage,checkoutPage.thanksMsg.getText());
    }
}