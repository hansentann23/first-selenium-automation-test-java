package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTests extends BaseTest {
    @Test
    public void testEditWebTable () throws InterruptedException {
        String email = "kierra@example.com";
        var webTablePage = homePage.goToElement().clickToWebTablesPage();
        webTablePage.clickEdit(email);
        webTablePage.setAgeField("90");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        String expectedAge = "90";
        Assert.assertEquals(actualAge, expectedAge, "\n Actual And Expected Ages Do Not Match \n");
    }
}
