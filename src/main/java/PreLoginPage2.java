import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PreLoginPage2 {

    public IOSDriver driver;

    public PreLoginPage2(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name='Войти как клиент Mobility или выбрать марку собственного автомобиля'])[25]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    public IOSElement mobikeyImg;
    @iOSXCUITFindBy(accessibility = "Войти как клиент Mobility")
    public IOSElement loginButton;
    @iOSXCUITFindBy(accessibility = "или выбрать марку собственного автомобиля")
    public IOSElement chooseVendorText;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Войти как клиент Mobility или выбрать марку собственного автомобиля\"])[25]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]")
    public IOSElement hyundaiImg;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Войти как клиент Mobility или выбрать марку собственного автомобиля\"])[25]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]")
    public IOSElement kiImg;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Войти как клиент Mobility или выбрать марку собственного автомобиля\"])[25]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]")
    public IOSElement genesisImg;
}
