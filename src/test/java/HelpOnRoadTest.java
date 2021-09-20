import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpOnRoadTest extends Methods {

    @Test
    public void testHelpOnRoad() {
        System.out.println(this.getClass().getName() + " " + "started!");

        loginToDev();
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        RoadHelpPage roadHelpPage = new RoadHelpPage(driver);
        // "+" button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.47);
        // help on road button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.73);

        Assert.assertTrue(roadHelpPage.helpHeader.isDisplayed(), "Help on road page is not present");
        Assert.assertTrue(roadHelpPage.active.isDisplayed(), "active is not present");
        Assert.assertTrue(roadHelpPage.whatIHave.isDisplayed(), "whatIHave is not present");
        Assert.assertTrue(roadHelpPage.forCall.isDisplayed(), "forCall is not present");
        Assert.assertTrue(roadHelpPage.callButton.isDisplayed(), "callButton is not present");
        Assert.assertTrue(roadHelpPage.sosText.isDisplayed(), "sosText is not present");
        Assert.assertTrue(roadHelpPage.sosImg.isDisplayed(), "sosImg is not present");

    }

}
