package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown (){
        var selectMenuPage = homePage.goToWidget().clickSelectMenuItem();
        selectMenuPage.selectStandardMultiSelect("Volvo");
        selectMenuPage.selectStandardMultiSelect(1);
        selectMenuPage.selectStandardMultiSelect("Audi");
        selectMenuPage.selectStandardMultiSelect(2);

        selectMenuPage.deselectStandardMultiSelect("saab");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));

    }
}
