package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class MultiSelectDropDownTest extends BaseTest {

    @Test
    public void testSelectFromMultiSelectDropDown (){
        var goToSelectMenuPage = homePage.goToWidget().clickSelectMenuItem();
        goToSelectMenuPage.selectMultiSelectDropDown("Black", "Blue");
    }
}
