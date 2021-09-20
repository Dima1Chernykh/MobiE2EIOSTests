import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class NFCCardsPage {

    public IOSDriver driver;

    public NFCCardsPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Для использования карты приложите ее к ручке двери")
    public IOSElement header;
    @iOSXCUITFindBy(accessibility = "Закрыть")
    public IOSElement closeButton;
    @iOSXCUITFindBy(accessibility = "Добавить еще карту")
    public IOSElement addCardButton;

}