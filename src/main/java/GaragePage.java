import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GaragePage {

    public IOSDriver driver;

    public GaragePage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"ГАРАЖ\"`]")
    public IOSElement garageHeader;
    @iOSXCUITFindBy(accessibility = "Выбрать")

    @iOSXCUITFindBy(accessibility = "Выбрать")
    public IOSElement selectButton;
}
