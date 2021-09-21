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

public class OpenMonitoringTest extends Methods {

    @Test
    public void testOpenMonitoring() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");

        CarManagementPage carManagementPage = new CarManagementPage(driver);
        MonitoringPage monitoringPage = new MonitoringPage(driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        // "+" button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.47);
        Thread.sleep(2000);
        // drivers button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.5);

        softAssert.assertTrue(monitoringPage.monitoringHeader.isDisplayed(), "Monitoring page is not present");
        softAssert.assertTrue(monitoringPage.backArrowButton.isDisplayed(), "backArrowButton is not present");
        softAssert.assertTrue(monitoringPage.reloadButton.isDisplayed(), "reloadButton is not present");
        softAssert.assertTrue(monitoringPage.maps.isDisplayed(), "maps is not present");
        softAssert.assertTrue(monitoringPage.currentPlaceButton.isDisplayed(), "currentPlaceButton is not present");

        softAssert.assertAll();

    }

}
