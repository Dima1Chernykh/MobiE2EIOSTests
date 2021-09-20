import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.offset.PointOption;
import lombok.var;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class AddDriverTest extends Methods {

    @Test
    public void testAddDriver() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");

        CarManagementPage carManagementPage = new CarManagementPage(driver);
        AddDriverPage addDriverPage = new AddDriverPage(driver);

        loginToDev();

        // "+" button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.47);
        Thread.sleep(1000);
        // drivers button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.43);
        Thread.sleep(1000);
        // add driver button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.568);

        Assert.assertTrue(addDriverPage.descriptionText.isDisplayed(), "Add driver page is not present");
        Assert.assertTrue(addDriverPage.phoneHeaderText.isDisplayed(), "Input header is not present");
        Assert.assertEquals(addDriverPage.phoneInput.getText(), "+7 999 999 99 99");
        Assert.assertTrue(addDriverPage.addButton.isDisplayed(), "Add button is not present");
        addDriverPage.addFromContactsButton.click();
        Assert.assertTrue(addDriverPage.searchContactsInput.isDisplayed(), "Contacts page is not present");
        addDriverPage.closeButton.click();

        // add driver button
        tapElementAt(carManagementPage.functionalityScreen, 0.5, 0.568);
        addDriverPage.phoneInput.sendKeys(phoneAddDriver);
        String phoneText = addDriverPage.phoneInput.getText();
        addDriverPage.addButton.click();
        Assert.assertTrue(addDriverPage.addDriverHeader.isDisplayed());
        Assert.assertEquals(phoneText.replaceAll("\\s", ""), (addDriverPage.addDriverNumber.getText()));
        addDriverPage.addDriverClose.click();
        Assert.assertTrue(carManagementPage.functionalityScreen.isDisplayed(), "Add driver page is not closed");

    }

}
