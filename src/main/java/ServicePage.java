import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {

    public IOSDriver driver;

    public ServicePage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Записаться на сервис\"`][4]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    public IOSElement backArrowButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Записаться на сервис\"`][6]")
    public IOSElement serviceHeader;
    // car block1
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Выбрать другой автомобиль'")
    public IOSElement chooseCarButton;
    // car block 2
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"VIN НОМЕР\"`]")
    public IOSElement vin;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"ГОД ВЫПУСКА\"`]")
    public IOSElement year;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"НАЧАЛО ГАРАНТИИ\"`]")
    public IOSElement guarantee;
    // works
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Техническое обслуживание\"`][3]")
    public IOSElement TOWork;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Шиномонтаж\"`][3]")
    public IOSElement tiresWork;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Ремонт\"`][3]")
    public IOSElement repairWork;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextView[`label == \"Здесь Вы можете написать свои пожелания к работе\"`]")
    public IOSElement comment;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Выбрать сервисный центр\"`][2]")
    public IOSElement selectButton;
    // choose service page
    @iOSXCUITFindBy(accessibility = "При использовании")
    public IOSElement acceptAlert;
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Выбор сервисного центра'")
    public IOSElement mapsServices;

}