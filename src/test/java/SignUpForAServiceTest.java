import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class SignUpForAServiceTest extends Methods {

    @Test
    public void testSignUpForAServiceTest() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");
        loginToDev();
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        ServicePage servicePage = new ServicePage(driver);
        SoftAssert softAssert = new SoftAssert();

        // "+" button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.465);
        // Sign up for a service button
        Thread.sleep(2000);
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.658);

        softAssert.assertTrue(servicePage.serviceHeader.isDisplayed(), "Service page is not present");
        softAssert.assertTrue(servicePage.chooseCarButton.isDisplayed(), "chooseCarButton is not present");
        softAssert.assertTrue(servicePage.vin.isDisplayed(), "vin is not present");
        softAssert.assertTrue(servicePage.year.isDisplayed(), "year is not present");
        softAssert.assertTrue(servicePage.guarantee.isDisplayed(), "guarantee is not present");
        softAssert.assertTrue(servicePage.TOWork.isDisplayed(), "TOWork is not present");
        softAssert.assertTrue(servicePage.tiresWork.isDisplayed(), "tiresWork is not present");
        softAssert.assertTrue(servicePage.repairWork.isDisplayed(), "repairWork is not present");
        softAssert.assertTrue(servicePage.comment.isDisplayed(), "comment is not present");
        softAssert.assertTrue(servicePage.selectButton.isDisplayed(), "selectButton is not present");

        servicePage.TOWork.click();
        servicePage.selectButton.click();
        servicePage.acceptAlert.click();
        softAssert.assertTrue(servicePage.mapsServices.isDisplayed(), "mapsServices is not present");
        // tap at back arrow
        tapElementAt(carManagementPage.functionalityScreen, 0.096, 0.078);
        servicePage.TOWork.click();

        servicePage.tiresWork.click();
        servicePage.selectButton.click();
        softAssert.assertTrue(servicePage.mapsServices.isDisplayed(), "mapsServices is not present");
        // tap at back arrow
        tapElementAt(carManagementPage.functionalityScreen, 0.096, 0.078);
        servicePage.tiresWork.click();

        servicePage.repairWork.click();
        servicePage.selectButton.click();
        softAssert.assertTrue(servicePage.mapsServices.isDisplayed(), "mapsServices is not present");

        softAssert.assertAll();
    }

}
