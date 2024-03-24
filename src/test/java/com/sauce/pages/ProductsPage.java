package com.sauce.pages;


import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage{
    @FindBy(className = "title")
    public WebElement productsText;
    @FindBy(className = "shopping_cart_badge")
    public WebElement cartBtn;

    public void addProduct(String price){
        Driver.get().findElement(By.xpath("//div[text()='" + price+"']/../button")).click();
    }
}
