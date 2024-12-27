package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTests extends BaseTest {
    @Test
    public void testProductHeaderIsDisplayed() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Thread.sleep(2000);
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
    }
}
