import lombok.var;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VINCheckIsWorkCorrectlyTest extends Methods {

    @Test
    public void testVINCheckIsWorkCorrectly() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        Methods methods = new Methods();
        VINCheckPage vinCheckPage = new VINCheckPage(driver);
        VehicleFoundPage vehicleFoundPage = new VehicleFoundPage(driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        // click burger button
        tapElementAt(carManagementPage.functionalityScreen, 0.917, 0.098);
        Thread.sleep(1000);

        sideMenuPage.VINCheck.click();
        vinCheckPage.vinCheckHeader.isDisplayed();
        vinCheckPage.noCarsText.isDisplayed();
        vinCheckPage.vinNumberHeader.isDisplayed();
        vinCheckPage.vinNumberInput.isDisplayed();
        vinCheckPage.findCarButton.isDisplayed();
        vinCheckPage.whereFindVIN.isDisplayed();

        // check Where found VIN modal
        vinCheckPage.whereFindVIN.click();
        softAssert.assertEquals(vinCheckPage.whereFindVINHeader.getText(), "Где найти VIN-номер?", "Modal is not present or text is not correct");
        vinCheckPage.whereFindVINCloseButton.click();

        // check incorrect vin number
        vinCheckPage.vinNumberInput.sendKeys(methods.generateRandomHexString(17));
        vinCheckPage.findCarButton.click();
        softAssert.assertEquals(vehicleFoundPage.notFoundHeader.getText(), "Автомобиль не обнаружен", "Modal is not present or text is incorrect");
        softAssert.assertEquals(vehicleFoundPage.notFoundBody.getText(), "Указанный VIN-номер не зарегистрирован в системе. Проверьте введенный номер или введите другой.", "Text is incorrect");
        vehicleFoundPage.notFoundCloseButton.click();

        // check correct VIN number
        vinCheckPage.vinNumberInput.clear();
        vinCheckPage.vinNumberInput.sendKeys(vin1);
        vinCheckPage.findCarButton.click();
        softAssert.assertTrue(vehicleFoundPage.vehicleFoundHeader.isDisplayed(), "Modal or string is not presented");
        softAssert.assertTrue(vehicleFoundPage.vinNumber1.isDisplayed(), "vinNumber is not presented");
        softAssert.assertTrue(vehicleFoundPage.modelCar.isDisplayed(), "modelCar is not presented");
        softAssert.assertTrue(vehicleFoundPage.misosMonitoring.isDisplayed(), "misosMonitoring is not presented");
        softAssert.assertTrue(vehicleFoundPage.deviceStatus.isDisplayed(), "deviceStatus is not presented");
        softAssert.assertTrue(vehicleFoundPage.mailButton.isDisplayed(), "mailButton is not presented");
        vehicleFoundPage.closeButton.click();
        wait.until(ExpectedConditions.elementToBeClickable((vinCheckPage.specialOffer)));
        softAssert.assertTrue(vinCheckPage.specialOffer.isDisplayed(), "specialOffer is not presented");

        vinCheckPage.vinNumberInput.clear();
        vinCheckPage.vinNumberInput.sendKeys(vin2);
        vinCheckPage.findCarButton.click();

        vinCheckPage.photo1.click();
        vinCheckPage.photoButton.click();
        Thread.sleep(500);
        vinCheckPage.acceptPhotoButton.click();

        vinCheckPage.photo2.click();
        vinCheckPage.photoButton.click();
        Thread.sleep(500);
        vinCheckPage.acceptPhotoButton.click();

        vinCheckPage.nextButton.click();

        softAssert.assertTrue(carManagementPage.carManagementHeader.isDisplayed());

        softAssert.assertAll();
    }

}
