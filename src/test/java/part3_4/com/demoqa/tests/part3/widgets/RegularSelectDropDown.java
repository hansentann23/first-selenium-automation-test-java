package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RegularSelectDropDown extends BaseTest {

    @Test
    public void testRegularSelectDropDown (){
        var goToSelectMenuPage = homePage.goToWidget().clickSelectMenuItem();
        goToSelectMenuPage.selectValueDropDown();
    }
}
