import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class StatisticPage {

    public IOSDriver driver;

    public StatisticPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Статистика\"`][1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    public IOSElement backArrowButton;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Статистика\"`]")
    public IOSElement statisticHeader;
    // days
    @iOSXCUITFindBy(accessibility = "ДНИ")
    public IOSElement days;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"ПН\"`]")
    public IOSElement monday;
    // months
    @iOSXCUITFindBy(accessibility = "МЕСЯЦЫ")
    public IOSElement months;
    @iOSXCUITFindBy(accessibility = "**/XCUIElementTypeStaticText[`label == \"ЯНВ\"`]")
    public IOSElement jan;
    // blocks
    @iOSXCUITFindBy(accessibility = "Ср. загрузка в будни")
    public IOSElement avgInDays;
    @iOSXCUITFindBy(accessibility = "Ср. загрузка в выходные")
    public IOSElement avgInHolidays;
    @iOSXCUITFindBy(accessibility = "Количество поездок")
    public IOSElement trips;
    @iOSXCUITFindBy(accessibility = "Общее время в пути")
    public IOSElement onWay;
    @iOSXCUITFindBy(accessibility = "Стиль вождения")
    public IOSElement style;
    @iOSXCUITFindBy(accessibility = "Максимальная скорость")
    public IOSElement maxSpeed;
    @iOSXCUITFindBy(accessibility = "Средняя скорость")
    public IOSElement avgSpeed;

}