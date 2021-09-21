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
    @iOSXCUITFindBy(iOSNsPredicate = "label contains '/permission/subscribe-vehicle'")
    public IOSElement subscribeCar;
    @iOSXCUITFindBy(iOSNsPredicate = "label contains '/openBag/'")
    public IOSElement openBag;
    @iOSXCUITFindBy(iOSNsPredicate = "label contains '/manage//door/'")
    public IOSElement door;
    @iOSXCUITFindBy(iOSNsPredicate = "label contains '/manage/engStart/'")
    public IOSElement startEng;
}
