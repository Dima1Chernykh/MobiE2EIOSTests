import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneNumberPage3 {

    public IOSDriver driver;

    public PhoneNumberPage3(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Номер вашего телефона\"`]")
    public IOSElement phoneNumberHeader;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public IOSElement phoneNumberInput;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения\"`][2]/XCUIElementTypeOther[1]")
    public IOSElement consentCheckbox;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения\"`]")
    public IOSElement consentText;
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public IOSElement continueButton;

}