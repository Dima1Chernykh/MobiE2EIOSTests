import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class RoadHelpPage {

    public IOSDriver driver;

    public RoadHelpPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Помощь на дороге\"`][4]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    public IOSElement backArrow;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Помощь на дороге\"`][6]")
    public IOSElement helpHeader;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Карта помощи')]")
    public IOSElement active;
    @iOSXCUITFindBy(accessibility = "Что мне доступно?")
    public IOSElement whatIHave;
    @iOSXCUITFindBy(accessibility = "Для связи со службой помощи на дороге нажмите")
    public IOSElement forCall;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Вызвать оператора\"`][2]")
    public IOSElement callButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Или нажмите кнопку SOS в автомобиле\"`]")
    public IOSElement sosText;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Или нажмите кнопку SOS в автомобиле\"`]/XCUIElementTypeOther/XCUIElementTypeImage")
    public IOSElement sosImg;

}