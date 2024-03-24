package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id = "first-name")
    public WebElement inputFirstname;
    @FindBy(id = "last-name")
    public WebElement inputLastname;
    @FindBy(id = "postal-code")
    public WebElement inputPostalCode;
    @FindBy(id = "continue")
    public WebElement continueBtn;
    @FindBy(css = ".summary_info_label.summary_total_label")
    public WebElement summaryTotal;
    @FindBy(id = "finish")
    public WebElement finishBtn;
    @FindBy(tagName = "h2")
    public WebElement thanksMsg;

    public void enterDetails(String firstname,String lastname, String postalCode){
        inputFirstname.sendKeys(firstname);
        inputLastname.sendKeys(lastname);
        inputPostalCode.sendKeys(postalCode);
        continueBtn.click();
    }
}