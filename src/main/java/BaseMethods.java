import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseMethods {

    public IOSDriver driver;

    public String IOS_APP_PATH = System.getenv("IOS_APP_PATH");
    public final String phone = "9265765225";
    public final String phoneForLocate = "+7 926 576 52 25";
    public final String decoratePhoneNumber = "+7 (926) 576-52-25";
    public final String phoneAddDriver = "9008008888";
    public final String vin1 = "Z94G2813BMR000001";
    public final String vin2 = "Z94G3813DMR258992";
    public final String confirmCodeDEV = "8346";

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("no-reset", "true");
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("platformVersion", "iOS 14.4");
        capabilities.setCapability("udid", "5711B7BE-FE76-40C1-A117-96FD78BC6AB4");
        capabilities.setCapability("xcodeOrgId", "DY2WBTAT33");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleID", "com.hyundai.mobilityMobikey");
        capabilities.setCapability("app", IOS_APP_PATH);
        capabilities.setCapability("language", "rus");
        capabilities.setCapability("systemPort", "8200");

        if (IOS_APP_PATH == null) {
            throw new RuntimeException("IOS_APP_PATH is not found in the environment");
        }

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Driver is started...");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
        System.out.println("Test is completed...");
    }
}

//to generate allure report
// allure generate --clean --output allure-results
// allure serve -h localhost
//to restart appium
// adb uninstall io.appium.uiautomator2.server
// adb uninstall io.appium.uiautomator2.server.test
//to find
// instruments -s devices
//to find bundleID
// osascript -e 'id of app ".../Library/Developer/Xcode/DerivedData/Mobikey-aoboaebbptbmibhkbzctthzxbpta/Build/Products/Release-iphonesimulator/Mobikey.app"'
//show taps on simulator
// defaults write com.apple.iphonesimulator ShowSingleTouches 1