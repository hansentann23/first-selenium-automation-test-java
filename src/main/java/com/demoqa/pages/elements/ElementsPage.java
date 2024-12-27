package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTablesItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickToWebTablesPage (){
        click(webTablesItem);
        return new WebTablesPage();
    }

    public LinksPage clickToLinksPage (){
        click(linksItem);
        return new LinksPage();
    }
}
