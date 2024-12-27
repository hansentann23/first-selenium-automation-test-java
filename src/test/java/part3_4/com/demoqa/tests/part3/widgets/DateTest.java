package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2024";
        var datePickerPage = homePage.goToWidget().clickDatePickerItem();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate,expectedDate, "\n Actual And Expected Date Do Not Match" +
                "\n Actual Date:   " + actualDate +
                "\n Expected Date: " + expectedDate);
    }
}
