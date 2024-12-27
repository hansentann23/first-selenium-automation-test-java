package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage{

    private By standardMultiSelect = By.id("cars");
    private By multiSelect = By.id("oldSelectMenu");
    private By multiSelectDropdown = By.xpath("//div[contains(text(),'Select...')]");
    private By selectValueDropDown = By.xpath("//div[contains(text(),'Select Option')]");

    public void selectStandardMultiSelect(String text){
        scrollToElementJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);

        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMultiSelect(int index){
        scrollToElementJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMultiSelect(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions (){
        return getAllSelectedOptions(standardMultiSelect);
    }

    public void selectMultiSelect (String value){
        scrollToElementJS(multiSelect);
        selectByValue(multiSelect, value);
    }

    public void selectMultiSelectDropDown (String option1, String option2){
        scrollToElementJS(multiSelectDropdown);
        click(multiSelectDropdown);
        click(By.xpath("//div[contains(text(),'"+option1+"')]"));
        click(By.xpath("//div[contains(text(),'"+option2+"')]"));
        click(By.xpath("//div[@class='css-xb97g8']"));
    }

    public void selectValueDropDown (){
        scrollToElementJS(selectValueDropDown);
        click(selectValueDropDown);
        click(By.xpath("//div[contains(text(),'Group 1, option 1')]"));
    }
}
