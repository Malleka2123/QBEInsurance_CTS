package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillingPaymentPage {
    WebDriver driver;

    private By billingMenu = By.id("BillingCenter-BillingTab");
    private By searchAccount = By.id("BillingCenter-BillingTab-SearchAccount");
    private By accountNumberField = By.id("SearchAccount-AccountNumber");
    private By searchButton = By.id("SearchAccount-SearchScreen-SearchAndResetInputSet-SearchLinksInputSet-Search");
    private By makePaymentButton = By.id("AccountDetail-MakePayment");
    private By amountField = By.id("PaymentScreen-Amount");
    private By submitPayment = By.id("PaymentScreen-Submit");

    public BillingPaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void makePayment(String accountNumber, String amount) {
        driver.findElement(billingMenu).click();
        driver.findElement(searchAccount).click();
        driver.findElement(accountNumberField).sendKeys(accountNumber);
        driver.findElement(searchButton).click();
        driver.findElement(makePaymentButton).click();
        driver.findElement(amountField).sendKeys(amount);
        driver.findElement(submitPayment).click();
    }
}