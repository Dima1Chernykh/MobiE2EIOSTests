import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class VINCheckPage extends BaseMethods {

    public IOSDriver driver;

    public VINCheckPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"УПРАВЛЕНИЕ АВТОМОБИЛЕМ\"`]")
    public IOSElement vinCheckHeader;
    @iOSXCUITFindBy(accessibility = "Автомобилей, привязанных к этому номеру телефона, не обнаружено. Попробуйте найти автомобиль по VIN-номеру.")
    public IOSElement noCarsText;
    @iOSXCUITFindBy(accessibility = "VIN НОМЕР АВТОМОБИЛЯ")
    public IOSElement vinNumberHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    public IOSElement vinNumberInput;
    @iOSXCUITFindBy(accessibility = "Найти автомобиль")
    public IOSElement findCarButton;
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'СПЕЦПРЕДЛОЖЕНИЕ'")
    public IOSElement specialOffer;
    @iOSXCUITFindBy(accessibility = "Где найти VIN-номер?")
    public IOSElement whereFindVIN;
    @iOSXCUITFindBy(accessibility = "Где найти VIN-номер?")
    public IOSElement whereFindVINHeader;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement whereFindVINCloseButton;
    // mobikey activation
    @iOSXCUITFindBy(accessibility = "Снимок СТС")
    public IOSElement photo1;
    @iOSXCUITFindBy(accessibility = "Снимок VIN номера")
    public IOSElement photo2;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Отменить\"`][2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public IOSElement photoButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Переснять\"`][2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public IOSElement acceptPhotoButton;
    @iOSXCUITFindBy(accessibility = "Далее")
    public IOSElement nextButton;

}
