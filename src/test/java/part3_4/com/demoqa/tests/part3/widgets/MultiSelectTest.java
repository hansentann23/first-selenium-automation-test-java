package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class MultiSelectTest extends BaseTest {

    @Test
    public void testMultiSelect (){
        var selectMenuPage = homePage.goToWidget().clickSelectMenuItem();
        selectMenuPage.selectMultiSelect("2");
    }
}
