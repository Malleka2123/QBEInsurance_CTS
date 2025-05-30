package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FNOLPage {
    WebDriver driver;

    private By claimMenu = By.id("ClaimCenter-ClaimTab");
    private By newClaimButton = By.id("ClaimCenter-ClaimTab-NewClaim");
    private By policySearch = By.id("NewClaim-NewClaimScreen-PolicySearchDV-PolicyNumber");
    private By nextButton = By.id("NewClaim-NewClaimScreen-NewClaimButton");

    public FNOLPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fileNewClaim(String policyNumber) {
        driver.findElement(claimMenu).click();
        driver.findElement(newClaimButton).click();
        driver.findElement(policySearch).sendKeys(policyNumber);
        driver.findElement(nextButton).click();
    }
}