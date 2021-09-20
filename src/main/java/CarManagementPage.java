import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;


public class CarManagementPage {

    public IOSDriver driver;

    public CarManagementPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String vinNumber = "Z94G2813BMR000001";

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"УПРАВЛЕНИЕ АВТОМОБИЛЕМ\"`]")
    public IOSElement carManagementHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]")
    public IOSElement functionalityScreen;
    // logger elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"X\"`][1]/XCUIElementTypeOther[1]")
    public IOSElement clearLogCarManagement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"X\"`][2]")
    public IOSElement closeLogCarManagement;
    // log responses
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@text, '/permission/subscribe-vehicle')]")
    public IOSElement subscribeCar;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@text, '/openBag/')]")
    public IOSElement openBag;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@text, '/manage//door/')]")
    public IOSElement door;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@text, '/manage/engStart/')]")
    public IOSElement startEng;
}
