package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.FNOLPage;
import utils.BaseTest;

public class FileFNOLTest extends BaseTest {

    @Test
    public void fileNewClaimTest() {
        LoginPage loginPage = new LoginPage(driver);
        FNOLPage fnolPage = new FNOLPage(driver);

        loginPage.login("claims_user", "password123");
        fnolPage.fileNewClaim("PC-123456");
    }
}