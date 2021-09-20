import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class VehicleFoundPage extends BaseMethods {

    public IOSDriver driver;

    public VehicleFoundPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(accessibility = "Автомобиль обнаружен")
    public IOSElement vehicleFoundHeader;
    @iOSXCUITFindBy(accessibility = vin1)
    public IOSElement vinNumber1;
    @iOSXCUITFindBy(accessibility = vin2)
    public IOSElement vinNumber2;
    @iOSXCUITFindBy(accessibility = "Hyundai SOLARIS")
    public IOSElement modelCar;
    @iOSXCUITFindBy(accessibility = "MISOS Lite")
    public IOSElement misosMonitoring;
    @iOSXCUITFindBy(accessibility = "Активно")
    public IOSElement deviceStatus;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Автомобиль обнаружен Мы нашли автомобиль с таким VIN-номером в нашей базе VIN НОМЕР АВТОМОБИЛЯ Z94G2813BMR000001 Марка и модель Hyundai SOLARIS Устройство мониторинга MISOS MISOS Lite Статус устройства Активно Закрыть\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther")
    public IOSElement mailButton;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement closeButton;
    // car is not found
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement notFoundHeader;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement notFoundBody;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement notFoundCloseButton;
}
