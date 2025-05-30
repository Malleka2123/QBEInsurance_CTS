package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePolicyPage {
    WebDriver driver;

    private By quoteButton = By.id("PolicyCenter-Quote");
    private By newSubmission = By.id("NewSubmission-NewSubmissionScreen-NewSubmission_Button");
    private By policyType = By.id("ProductSelection-ProductSelectionScreen-ProductSelectionLV-0-SelectProduct");

    public CreatePolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewPolicy() {
        driver.findElement(quoteButton).click();
        driver.findElement(newSubmission).click();
        driver.findElement(policyType).click();
    }
}