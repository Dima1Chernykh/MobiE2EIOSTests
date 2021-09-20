import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseMethods {

    public IOSDriver driver;

    public ProfilePage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Профиль\"`][3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    public IOSElement backArrow;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Профиль\"`]")
    public IOSElement profileHeader;
    @iOSXCUITFindBy(accessibility = "ТЕЛЕФОН")
    public IOSElement phoneHeader;
    @iOSXCUITFindBy(accessibility = "+7" + phone)
    public IOSElement phoneNumber;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Деактивация устройства MISOS\"`][2]")
    public IOSElement deactivationMISOS;
}
