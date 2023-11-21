package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AileButcemPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitHelper;


public class AileButcem {

    //2.06

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    TouchAction touchAction = new TouchAction<>(driver);

    AileButcemPage aileButcemPage = new AileButcemPage();

    @Given("Ilk ekran ayarlarini yapar ve login sayfasina ulasir")
    public void ılkEkranAyarlariniYaparVeLoginSayfasinaUlasir() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, 30); // Wait for up to 30 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=\"Aile Bütçem ile gelir, gider ve birikimlerinizin tamamını aynı yerden yönetebilirsiniz. Bireysel ya da ortak bütçe oluşturarak hayatı yönetmeye başlayın.\"]")));

        ReusableMethods.belliSayiIleEkranKaydirma(905, 983, 100, 983, 500, 6);
        WaitHelper.waitForClickablility(aileButcemPage.girisYapButonu, 10).click();

/*
for (int i = 0; i < 6; i++) {
            touchAction.
                    press(PointOption.point(905, 983)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(100, 983)).release().perform();

        }

 */

    }

    @Then("{string} ve {string} bilgilerini girerek giris yapar.") //asil onemli olan buradaki isim ve yapi. ASagisi onemli degildir. Asagidaki Method adi degil de parametreleri onemli.
    public void mail_ve_password_bilgilerini_girerek_giris_yapar(String arg1, String arg2) {
        WaitHelper.waitForClickablility(aileButcemPage.emailField,10).sendKeys(ConfigReader.getProperty(arg1));
        WaitHelper.waitForClickablility(aileButcemPage.passwordField,10).sendKeys(ConfigReader.getProperty(arg2));
        WaitHelper.waitForClickablility(aileButcemPage.girisYapButonu,10).click();


    }

    @Then("kullanicnin giris yapabildigini dogrulanir")
    public void kullanicnin_giris_yapabildigini_dogrulanir() {
        WaitHelper.waitForVisible(aileButcemPage.toastMessage,10);
        String  toastMessage =aileButcemPage.toastMessage.getText();
        Assert.assertEquals(toastMessage,"Başarılı");

        /*
        burada istersen Reusable Methodsdaki IsVisible ToastMessage i da kullanabilirdin.
         */

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
