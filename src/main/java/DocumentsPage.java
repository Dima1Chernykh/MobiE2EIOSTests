import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {

    public IOSDriver driver;

    public DocumentsPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Документы\"`]")
    public IOSElement documentsHeader;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Документы\"`][3]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    public IOSElement backArrow;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Инструкция Mobikey\"`][2]")
    public IOSElement mobikeyManual;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"mobility.hyundai.ru/media/d...\"`]")
    public IOSElement mobikeyManualURL;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Пользовательское соглашение\"`][2]")
    public IOSElement userAgreement;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"mobility.hyundai.ru/media/d...\"`]")
    public IOSElement userAgreementURL;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Согласие на обработку персональных данных\"`][2]")
    public IOSElement personalData;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"mobility.hyundai.ru/media/d...\"`]")
    public IOSElement personalDataURL;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Политика конфиденциальности Хёндэ Мотор СНГ\"`][2]")
    public IOSElement privacyPolicy;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"www.hyundai.ru/Privacy\"`]")
    public IOSElement privacyPolicyURL;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"mobility.hyundai.ru/media/d... Открыть\"`]/XCUIElementTypeOther[1]")
    public IOSElement xButton1;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"www.hyundai.ru/Privacy Открыть\"`]/XCUIElementTypeOther[1]")
    public IOSElement xButton2;

}
