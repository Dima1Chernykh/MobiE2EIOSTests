import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenSideMenuAndSelectAllPagesTest extends Methods {

    @Test
    public void testOpenSideMenuAndSelectAllPages() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        DocumentsPage documentsPage = new DocumentsPage(driver);
        VINCheckPage vinCheckPage = new VINCheckPage(driver);
        StartPage1 startPage1 = new StartPage1(driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        // click burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        Thread.sleep(1000);

        softAssert.assertTrue(sideMenuPage.phoneNumberText.isDisplayed(), "Phone number is not displayed");
        softAssert.assertTrue(sideMenuPage.mobikey.isDisplayed(), "Mobikey is not displayed");
        softAssert.assertTrue(sideMenuPage.profile.isDisplayed(), "Profile is not displayed");
        softAssert.assertTrue(sideMenuPage.documents.isDisplayed(), "Documents is not displayed");
        softAssert.assertTrue(sideMenuPage.VINCheck.isDisplayed(), "VIN check is not displayed");
        softAssert.assertTrue(sideMenuPage.logout.isDisplayed(), "Logout is not displayed");

        // check page Mobikey
        sideMenuPage.mobikey.click();
        softAssert.assertTrue(carManagementPage.carManagementHeader.isDisplayed(), "Mobikey is not opened");

        // check page Profile
        // click burger button
        Thread.sleep(2000);
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        sideMenuPage.profile.isEnabled();
        sideMenuPage.profile.click();
        softAssert.assertTrue(profilePage.profileHeader.isDisplayed(), "Profile is not opened");
        softAssert.assertTrue(profilePage.phoneHeader.isDisplayed(), "Phone area header is not present");
        softAssert.assertEquals(profilePage.phoneNumber.getText(), ("+7" + phone), "Phone number is not present or incorrect");
        softAssert.assertTrue(profilePage.deactivationMISOS.isDisplayed(), "Deactivated button is not present");
        profilePage.backArrow.click();

        // check page Documents
        Thread.sleep(2000);
        // click burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        sideMenuPage.documents.isEnabled();
        sideMenuPage.documents.click();
        softAssert.assertTrue(documentsPage.documentsHeader.isDisplayed(), "Documents is not opened");
        softAssert.assertTrue(documentsPage.mobikeyManual.isDisplayed(), "mobikeyManual is not present");
        softAssert.assertTrue(documentsPage.userAgreement.isDisplayed(), "userAgreement is not present");
        softAssert.assertTrue(documentsPage.personalData.isDisplayed(), "personalData is not present");
        softAssert.assertTrue(documentsPage.privacyPolicy.isDisplayed(), "privacyPolicy is not present");
        documentsPage.backArrow.isEnabled();
        documentsPage.backArrow.click();

        // check page VIN check
        Thread.sleep(2000);
        // click burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        sideMenuPage.VINCheck.isEnabled();
        sideMenuPage.VINCheck.click();
        softAssert.assertTrue(vinCheckPage.vinCheckHeader.isDisplayed(), "VIN check is not opened");

        // check Logout
        Thread.sleep(2000);
        // click burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        sideMenuPage.logout.isEnabled();
        sideMenuPage.logout.click();
        softAssert.assertTrue(startPage1.startPageImg.isDisplayed(), "Logout is not worked");

        softAssert.assertAll();
    }

}
