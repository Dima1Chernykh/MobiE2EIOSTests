import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDriverPage extends BaseMethods {

    public IOSDriver driver;

    public AddDriverPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Для доступа к автомобилям вы можете добавить не больше 3-х водителей. Водители должны быть авторизованы в одном из сервисов Mobility. После добавления водитель получит SMS уведомление о добавлении. ТЕЛЕФОН +7 999 999 99 99 Добавить из контактов Добавить\"`][2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public IOSElement closeButtonX;
    @iOSXCUITFindBy(accessibility = "Для доступа к автомобилям вы можете добавить не больше 3-х водителей. Водители должны быть авторизованы в одном из сервисов Mobility. После добавления водитель получит SMS уведомление о добавлении.")
    public IOSElement descriptionText;
    @iOSXCUITFindBy(accessibility = "ТЕЛЕФОН")
    public IOSElement phoneHeaderText;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    public IOSElement phoneInput;
    @iOSXCUITFindBy(accessibility = "Добавить из контактов")
    public IOSElement addFromContactsButton;
    @iOSXCUITFindBy(accessibility = "Добавить")
    public IOSElement addButton;
    @iOSXCUITFindBy(accessibility = "\uD83D\uDD0D Искать в 6 контактах")
    public IOSElement searchContactsInput;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement closeButton;
    @iOSXCUITFindBy(accessibility = "Пользователь не зарегистрирован")
    public IOSElement addDriverHeader;
    @iOSXCUITFindBy(accessibility = "+7" + phoneAddDriver)
    public IOSElement addDriverNumber;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement addDriverClose;
}