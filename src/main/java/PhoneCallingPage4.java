import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneCallingPage4 {

    public IOSDriver driver;

    public PhoneCallingPage4(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Bottom Sheet")
    public IOSElement bottomSheet;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Сейчас Вам позвонят\"`]")
    public IOSElement phoneCallingHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Да, мне позвонили\"`]")
    public IOSElement yesCalledButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Нет, повторить звонок\"`]")
    public IOSElement noCallButton;

    // Confirm call page
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Подтвердите звонок\"`]")
    public IOSElement confirmCodeHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"9999\"`]")
    public IOSElement confirmCodeInput;

}
