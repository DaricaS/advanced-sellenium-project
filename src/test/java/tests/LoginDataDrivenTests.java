package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginDataDrivenTests extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"tomsmith", "SuperSecretPassword!", true},
                {"wronguser", "SuperSecretPassword!", false},
                {"tomsmith", "wrongpassword", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, boolean isSuccess) {

        LoginPage page = new LoginPage(driver);
        page.open();
        page.login(username, password);

        if (isSuccess) {
            Assert.assertTrue(page.getMessage().contains("You logged into a secure area!"));
        } else {
            Assert.assertTrue(page.getMessage().contains("Your username is invalid!") ||
                    page.getMessage().contains("Your password is invalid!"));
        }
    }
}

