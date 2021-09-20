import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;


public class Methods extends BaseMethods {

//    protected AppiumDriver<MobileElement> driver;
//    protected AndroidDriver androidDriver;
    // random string generation
    public static String generateRandomHexString (int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    // tap to coordinates
    ExpectedCondition<Boolean> elementFoundAndClicked(final By locator) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                WebElement el = driver.findElement(locator);
                el.click();
                return true;
            }
        };
    }

    protected AppiumDriver<MobileElement> getDriver() {
        return this.driver;
    }

    public void tapAtPoint(Point point) {
        AppiumDriver<MobileElement> d = this.getDriver();
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap = new Sequence(input, 0);
        tap.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point.x, point.y));
        tap.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(input, ofMillis(200L)));
        tap.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        d.perform(ImmutableList.of(tap));
    }
    // tap to coordinates
    public WebElement tapElementAt(WebElement el, double xPct, double yPct) {
        Rectangle elRect = el.getRect();
        Point point = new Point(elRect.x + (int)((double)elRect.getWidth() * xPct), elRect.y + (int)((double)elRect.getHeight() * yPct));
        this.tapAtPoint(point);
        return el;
    }
    // return X coord
    public double returnX(WebElement el, double xPct) {
        Rectangle elRect = el.getRect();
        double point = elRect.x + (int)((double)elRect.getWidth() * xPct);
        return point;
    }
    // return Y coord
    public double returnY(WebElement el, double yPct) {
        Rectangle elRect = el.getRect();
        double point = elRect.y + (int)((double)elRect.getHeight() * yPct);
        return point;
    }

    public void tapElement(WebElement el) {
        this.tapElementAt(el, 0.5D, 0.5D);
    }
    //

    // long tap with custom duration
    public static Boolean moveToThenSlowClickElement(final WebDriver driver, final WebElement toElement, final int millisecondsOfWaitTime) throws InterruptedException {
        final Actions clickOnElementAndHold = new Actions(driver);
        final Actions release = new Actions(driver);
        clickOnElementAndHold.clickAndHold(toElement).perform();

        sleep(millisecondsOfWaitTime);

        final Action hoverOverCheckBox = clickOnElementAndHold.build();
        hoverOverCheckBox.perform();

        return true;
    }

    protected void loginToDev() {

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        StartPage1 startPage1 = new StartPage1(this.driver);
        PreLoginPage2 preLoginPage2 = new PreLoginPage2(this.driver);
        PhoneNumberPage3 phoneNumberPage3 = new PhoneNumberPage3(this.driver);
        PhoneCallingPage4 phoneCallingPage4 = new PhoneCallingPage4(this.driver);
        CarManagementPage carManagementPage = new CarManagementPage(this.driver);

        wait.until(ExpectedConditions.elementToBeClickable((startPage1.submitBegin)));
        startPage1.submitBegin.click();
        wait.until(ExpectedConditions.elementToBeClickable((preLoginPage2.loginButton)));
        preLoginPage2.loginButton.click();

        phoneNumberPage3.phoneNumberInput.isDisplayed();
        phoneNumberPage3.phoneNumberInput.sendKeys(phone);

        phoneNumberPage3.consentCheckbox.click();
        phoneNumberPage3.consentCheckbox.click();
        wait.until(ExpectedConditions.elementToBeClickable((phoneNumberPage3.continueButton)));
        phoneNumberPage3.continueButton.click();

        phoneCallingPage4.bottomSheet.isDisplayed();
        // DEV button click
        tapElementAt(phoneCallingPage4.bottomSheet, 0.5, 0.85);

        wait.until(ExpectedConditions.elementToBeClickable((phoneCallingPage4.yesCalledButton)));
        phoneCallingPage4.yesCalledButton.click();

        wait.until(ExpectedConditions.elementToBeClickable((phoneCallingPage4.confirmCodeInput)));
        phoneCallingPage4.confirmCodeInput.sendKeys(confirmCodeDEV);

        wait.until(ExpectedConditions.elementToBeClickable((carManagementPage.carManagementHeader)));
        Assert.assertTrue(carManagementPage.carManagementHeader.isDisplayed(), "Login is not completed");
    }

}
