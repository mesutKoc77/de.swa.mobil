package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.swaPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitHelper;


public class swa {

    //2.06

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction touchAction = new TouchAction<>(driver);

    swaPage swaPage = new swaPage();

    @Given("Ilk ekran ayarlarini yapar ve login sayfasina ulasir")
    public void ılkEkranAyarlariniYaparVeLoginSayfasinaUlasir() throws InterruptedException {
        WaitHelper.waitForClickablility(swaPage.weiterButton, 10).click();
        WaitHelper.waitForClickablility(swaPage.weiterButton, 10).click();
        WaitHelper.waitForClickablility(swaPage.weiterButton, 10).click();
        WaitHelper.waitForClickablility(swaPage.losgehtButton, 10).click();
        WaitHelper.waitForClickablility(swaPage.weiterButton, 10).click();
        WaitHelper.waitForClickablility(swaPage.allowLocationButton, 10).click();
    }

    @Then("Kullanici D_Ticket'i tiklar")
    public void kullaniciD_TicketITiklar() throws InterruptedException {
        WaitHelper.waitForClickablility(swaPage.deutschlandTicketButton,10).click();
        WaitHelper.waitForClickablility(swaPage.closeButton,10).click();
        WaitHelper.waitForClickablility(swaPage.ticketsButton,10).click();
        WaitHelper.sleep(2);
        Driver.getAndroidDriver().navigate().back();
        ReusableMethods.scroll(539,1801,543,579);
        /*
        swa Carsharaing i tiklar
        geri gelir
        ReusableMethods.scroll(539,1801,543,579);
        Abfahrten i tiklar
        sayfa yuklenene kadar bekler ya da 5 saniye
        geri doner
        //tiklamalar yapar ama sayfa hareket etmez
        ReusableMethods.scroll(539,1801,543,579);
        Verkehrsmeldungen i tiklar
        sayfa yuklenene kadar bekler ya da 5 saniye
        geri doner
        ReusableMethods.scroll(539,1801,543,579);
        Favoritene tiklar
        Es wurden noch keine Favoriten hinzugefügt yazisi cikana kadar bekler
        geri gelir
        ReusableMethods.scroll(539,1801,543,579);
        //tiklamalar yapar ama sayfa hareket etmez
        Feedback e tiklar
        Feedback senden elementi tiklanabilir olana kadar bekler
        geri doner
        biraz bbekler
        ReusableMethods.scroll(539,1801,543,579);
        geri doner

         */
    }




}
