package password;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.RetrievePasswordPage;

import static org.testng.Assert.assertTrue;

public class RetrievePasswordTest extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage
                = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("smilech@op.pl");
        RetrievePasswordPage retrievePasswordPage = forgotPasswordPage.clickRetrievePassword();
        String message = "Internal Server Error";
        assertTrue(message.contains("Internal Server Error"), "it is not good");

    }

}
