import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HelpOnRoadTest extends Methods {

    @Test
    public void testHelpOnRoad() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");

        loginToDev();
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        RoadHelpPage roadHelpPage = new RoadHelpPage(driver);
        SoftAssert softAssert = new SoftAssert();

        // "+" button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.47);
        Thread.sleep(2000);
        // help on road button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.73);

        softAssert.assertTrue(roadHelpPage.helpHeader.isDisplayed(), "Help on road page is not present");
        softAssert.assertTrue(roadHelpPage.active.isDisplayed(), "active is not present");
        softAssert.assertTrue(roadHelpPage.whatIHave.isDisplayed(), "whatIHave is not present");
        softAssert.assertTrue(roadHelpPage.forCall.isDisplayed(), "forCall is not present");
        softAssert.assertTrue(roadHelpPage.callButton.isDisplayed(), "callButton is not present");
        softAssert.assertTrue(roadHelpPage.sosText.isDisplayed(), "sosText is not present");
        softAssert.assertTrue(roadHelpPage.sosImg.isDisplayed(), "sosImg is not present");

        softAssert.assertAll();
    }

}
