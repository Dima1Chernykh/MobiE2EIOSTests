import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage1 {

    public IOSDriver driver;

    public StartPage1(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Начать\"`][25]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage")
    public IOSElement startPageImg;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Начать\"`][26]")
    public IOSElement submitBegin;

}