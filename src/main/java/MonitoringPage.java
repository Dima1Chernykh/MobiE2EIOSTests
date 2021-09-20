import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitoringPage {

    public IOSDriver driver;

    public MonitoringPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Мониторинг\"`]")
    public IOSElement monitoringHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мониторинг\"`][1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public IOSElement backArrowButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мониторинг\"`][1]/XCUIElementTypeOther[3]/XCUIElementTypeOther")
    public IOSElement reloadButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Compass My location Google Maps Мониторинг Bottom Sheet\"`][7]/XCUIElementTypeOther[4]")
    public IOSElement currentPlaceButton;
    @iOSXCUITFindBy(accessibility = "Google Maps")
    public IOSElement maps;

}