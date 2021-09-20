import org.testng.Assert;
import org.testng.annotations.Test;

public class VINCheckIsWorkCorrectlyTest extends Methods {

    @Test
    public void testLoginToDEVTest() throws InterruptedException {
        System.out.println(this.getClass().getName() + " " + "started!");
        CarManagementPage carManagementPage = new CarManagementPage(driver);
        SideMenuPage sideMenuPage = new SideMenuPage(driver);
        Methods methods = new Methods();
        VINCheckPage vinCheckPage = new VINCheckPage(driver);
        VehicleFoundPage vehicleFoundPage = new VehicleFoundPage(driver);

        methods.loginToDev();

//        carManagementPage.burgerButton.click();
        sideMenuPage.VINCheck.click();
        vinCheckPage.vinCheckHeader.isDisplayed();
        vinCheckPage.noCarsText.isDisplayed();
        vinCheckPage.vinNumberHeader.isDisplayed();
        vinCheckPage.vinNumberInput.isDisplayed();
        vinCheckPage.findCarButton.isDisplayed();
        vinCheckPage.whereFindVIN.isDisplayed();

        // check Where found VIN modal
        vinCheckPage.whereFindVIN.click();
        Assert.assertEquals(vinCheckPage.whereFindVINHeader.getText(), "Где найти VIN-номер?", "Modal is not present or text is not correct");
        vinCheckPage.whereFindVINCloseButton.click();

        // check incorrect vin number
        vinCheckPage.vinNumberInput.sendKeys(methods.generateRandomHexString(17));
        vinCheckPage.findCarButton.click();
        Assert.assertEquals(vehicleFoundPage.notFoundHeader.getText(), "Автомобиль не обнаружен", "Modal is not present or text is incorrect");
        Assert.assertEquals(vehicleFoundPage.notFoundBody.getText(), "Указанный VIN-номер не зарегистрирован в системе. Проверьте введенный номер или введите другой.", "Text is incorrect");
        vehicleFoundPage.notFoundCloseButton.click();

        // check correct VIN number
        vinCheckPage.vinNumberInput.clear();
        vinCheckPage.vinNumberInput.sendKeys(vin1);
        vinCheckPage.findCarButton.click();
        Assert.assertTrue(vehicleFoundPage.vehicleFoundHeader.isDisplayed(), "Modal or string is not presented");
        Assert.assertTrue(vehicleFoundPage.vinNumber1.isDisplayed(), "vinNumber is not presented");
        Assert.assertTrue(vehicleFoundPage.modelCar.isDisplayed(), "modelCar is not presented");
        Assert.assertTrue(vehicleFoundPage.misosMonitoring.isDisplayed(), "misosMonitoring is not presented");
        Assert.assertTrue(vehicleFoundPage.deviceStatus.isDisplayed(), "deviceStatus is not presented");
        Assert.assertTrue(vehicleFoundPage.mailButton.isDisplayed(), "mailButton is not presented");
        driver.navigate().back();
        Assert.assertTrue(vinCheckPage.specialOffer.isDisplayed(), "specialOffer is not presented");

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

        Assert.assertTrue(carManagementPage.carManagementHeader.isDisplayed());

    }

}
