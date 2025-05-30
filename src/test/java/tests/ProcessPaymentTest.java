package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.BillingPaymentPage;
import utils.BaseTest;

public class ProcessPaymentTest extends BaseTest {

    @Test
    public void makePaymentTest() {
        LoginPage loginPage = new LoginPage(driver);
        BillingPaymentPage paymentPage = new BillingPaymentPage(driver);

        loginPage.login("billing_user", "password123");
        paymentPage.makePayment("ACCT-987654", "250.00");
    }
}