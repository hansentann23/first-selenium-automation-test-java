package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTests extends BaseTest {

    @Test
    public void testLinks(){
        var linksPage = homePage.goToElement().clickToLinksPage();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request")
        , "\n Actual Response (" + actualResponse + ") \n Does Not Contain '400' and 'Bad Request' \n");

    }
}
