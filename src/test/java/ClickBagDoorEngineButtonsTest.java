import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class ClickBagDoorEngineButtonsTest extends Methods {

    @Test
    public void testClickBagDoorEngineButtons() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        // check bag
        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        carManagementPage.clearLogCarManagement.click();
        carManagementPage.closeLogCarManagement.click();
        Thread.sleep(1000);
        // tap at bag
        tapElementAt(carManagementPage.functionalityScreen,0.5, 0.235);
        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        softAssert.assertTrue(carManagementPage.openBag.isDisplayed(), "Response for bag is not detected");
        // check left door
        Thread.sleep(10000);
        carManagementPage.clearLogCarManagement.click();
        carManagementPage.closeLogCarManagement.click();
        // tap at left door
        tapElementAt(carManagementPage.functionalityScreen,0.2, 0.47);
        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        softAssert.assertTrue(carManagementPage.door.isDisplayed(), "Response for left door is not detected");
        // check right door
        Thread.sleep(10000);
        carManagementPage.clearLogCarManagement.click();
        carManagementPage.closeLogCarManagement.click();
        // tap at right door
        tapElementAt(carManagementPage.functionalityScreen,0.8, 0.47);
        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        softAssert.assertTrue(carManagementPage.door.isDisplayed(), "Response for right door is not detected");
        // start engine
        Thread.sleep(10000);
        carManagementPage.clearLogCarManagement.click();
        carManagementPage.closeLogCarManagement.click();
        // long tap at engine
        new TouchAction(driver).press(point((int)returnX(carManagementPage.functionalityScreen,0.5), (int)returnY(carManagementPage.functionalityScreen, 0.627)))
                .waitAction(waitOptions(Duration.ofMillis(5000))).release().perform();
        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        softAssert.assertTrue(carManagementPage.startEng.isDisplayed(), "Response for engine is not detected");
        carManagementPage.closeLogCarManagement.click();

        // logout
        // tap at burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        sideMenuPage.logout.click();

        softAssert.assertAll();
    }

}
