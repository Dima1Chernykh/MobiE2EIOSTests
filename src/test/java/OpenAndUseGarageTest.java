import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
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
import java.util.concurrent.TimeUnit;

public class OpenAndUseGarageTest extends Methods {

    @Test
    public void testOpenAndUseGarage() {
        System.out.println(this.getClass().getName() + " " + "started!");

        CarManagementPage carManagementPage = new CarManagementPage(driver);
        GaragePage garagePage = new GaragePage(driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        carManagementPage.clearLogCarManagement.click();
        carManagementPage.closeLogCarManagement.click();

        // tap at garage page
        tapElementAt(carManagementPage.functionalityScreen, 0.78,0.78);
        softAssert.assertTrue(garagePage.garageHeader.isDisplayed(), "Garage page is not open");

        // check back arrow
        //tap at back arrow
        tapElementAt(carManagementPage.functionalityScreen,0.5, 0.16);
        softAssert.assertTrue(carManagementPage.functionalityScreen.isDisplayed(), "Back arrow in garage is not work");

        // check select car
        tapElementAt(carManagementPage.functionalityScreen, 0.78,0.78);

        garagePage.selectButton.isEnabled();
        garagePage.selectButton.click();
        softAssert.assertTrue(carManagementPage.functionalityScreen.isDisplayed(), "Select car in garage is not work");

        //tap at logger
        tapElementAt(carManagementPage.functionalityScreen,0.096, 0.909);
        softAssert.assertTrue(carManagementPage.subscribeCar.isDisplayed());

        softAssert.assertAll();
    }

}
