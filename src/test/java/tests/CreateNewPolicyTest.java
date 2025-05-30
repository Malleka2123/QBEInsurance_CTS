package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CreatePolicyPage;
import utils.BaseTest;

public class CreateNewPolicyTest extends BaseTest {

    @Test
    public void createPolicyQuote() {
        LoginPage loginPage = new LoginPage(driver);
        CreatePolicyPage policyPage = new CreatePolicyPage(driver);

        loginPage.login("testuser", "password123");
        policyPage.createNewPolicy();
    }
}