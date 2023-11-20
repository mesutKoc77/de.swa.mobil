package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AileButcem {

    //1.46:13

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction touchAction = new TouchAction<>(driver);

    @Given("Ilk ekran ayarlarini yapar ve login sayfasina ulasir")
    public void ılkEkranAyarlariniYaparVeLoginSayfasinaUlasir() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, 30); // Wait for up to 30 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=\"Aile Bütçem ile gelir, gider ve birikimlerinizin tamamını aynı yerden yönetebilirsiniz. Bireysel ya da ortak bütçe oluşturarak hayatı yönetmeye başlayın.\"]")));

        ReusableMethods.belliSayiIleEkranKaydirma(905,983,100,983,500,6);
/*
for (int i = 0; i < 6; i++) {
            touchAction.
                    press(PointOption.point(905, 983)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(100, 983)).release().perform();

        }

 */
    }




    @Then("Mail ve password bilgilerini girerek giris yapar.")
    public void mail_ve_password_bilgilerini_girerek_giris_yapar() {

    }

    @Then("kullanicnin giris yapabildigini dogrulanir")
    public void kullanicnin_giris_yapabildigini_dogrulanir() {


    }

    @Then("Sol kisimdaki hesabim bolumune gidwer")
    public void sol_kisimdaki_hesabim_bolumune_gidwer() {

    }

    @Then("Hesabim bolumundeki degisikileri degistirir ve kayit eder.")
    public void hesabim_bolumundeki_degisikileri_degistirir_ve_kayit_eder() {

    }


    @And("Degisikliklerin basariyla yapildigi dogrulanir")
    public void degisikliklerinBasariylaYapildigiDogrulanir() {
    }


}
