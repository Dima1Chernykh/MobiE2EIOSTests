import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenuPage extends BaseMethods {

    public IOSDriver driver;

    public SideMenuPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeImage\"")
    public IOSElement mobikeyImage;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='" + phoneForLocate + "']")
    public IOSElement phoneNumberText;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Mobikey\"`][2]")
    public IOSElement mobikey;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Профиль\"`][2]")
    public IOSElement profile;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Документы\"`][2]")
    public IOSElement documents;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Проверка по VIN\"`][2]")
    public IOSElement VINCheck;
    @iOSXCUITFindBy(accessibility = "Выйти")
    public IOSElement logout;
}
