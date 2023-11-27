package stepdefinitions;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    String randomName;
    String randomSurname;
    String randomAge;
    String randomJob;
    String randomCity;

    Faker faker = new Faker();

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

    @Then("{string} ve {string} bilgilerini girerek giris yapar.")
    //asil onemli olan buradaki isim ve yapi. ASagisi onemli degildir. Asagidaki Method adi degil de parametreleri onemli.
    public void mail_ve_password_bilgilerini_girerek_giris_yapar(String Email, String Password) {
        WaitHelper.waitForClickablility(aileButcemPage.emailField, 10).sendKeys(ConfigReader.getProperty(Email));
        WaitHelper.waitForClickablility(aileButcemPage.passwordField, 10).sendKeys(ConfigReader.getProperty(Password));
        WaitHelper.waitForClickablility(aileButcemPage.girisYapButonu, 10).click();

    }

    @Then("kullanicnin giris yapabildigini dogrulanir")
    public void kullanicnin_giris_yapabildigini_dogrulanir() {
        WaitHelper.waitForVisible(aileButcemPage.toastMessage, 10);
        String toastMessage = aileButcemPage.toastMessage.getText();
        Assert.assertEquals(toastMessage, "Başarılı");

        /*
        burada istersen Reusable Methodsdaki IsVisible ToastMessage i da kullanabilirdin.
         */

    }

    @Then("Sol kisimdaki {string} bolumune gidwer")
    public void sol_kisimdaki_hesabim_bolumune_gidwer(String ilgiliBolum) throws InterruptedException {

        WaitHelper.waitForClickablility(aileButcemPage.kafaField, 10).click();
        WaitHelper.sleep(5);
        WaitHelper.waitForClickablility(aileButcemPage.hamburgerMenu, 30).click();
        ReusableMethods.scrollWithUiScrollable(ilgiliBolum);

    }

    @Then("Hesabim bolumundeki degisikileri degistirir ve kayit eder.")
    public void hesabim_bolumundeki_degisikileri_degistirir_ve_kayit_eder() throws InterruptedException {
        WaitHelper.sleep(5);
        randomName = faker.name().name();
        randomSurname = faker.name().lastName();
        randomAge = faker.number().digit();
        randomJob = faker.job().position();
        randomCity = faker.address().cityName();

        aileButcemPage.nameBox.clear();
        aileButcemPage.nameBox.sendKeys(randomName);
        aileButcemPage.surnameBox.clear();
        aileButcemPage.surnameBox.sendKeys(randomSurname);
        aileButcemPage.ageBox.clear();
        aileButcemPage.ageBox.sendKeys(randomAge);
        aileButcemPage.jobBox.clear();
        aileButcemPage.jobBox.sendKeys(randomJob);
        aileButcemPage.cityBox.clear();
        aileButcemPage.cityBox.sendKeys(randomCity);

        aileButcemPage.kaydetField.click();


    }


    @And("Degisikliklerin basariyla yapildigi dogrulanir")
    public void degisikliklerinBasariylaYapildigiDogrulanir() {

        String text = aileButcemPage.basariliBox.getText();
        Assert.assertEquals(text, "Başarılı");

        String savedName = aileButcemPage.nameBox.getText();
        String savedSurname = aileButcemPage.surnameBox.getText();
        String savedAge = aileButcemPage.ageBox.getText();
        String savedJob = aileButcemPage.jobBox.getText();
        String savedCity = aileButcemPage.cityBox.getText();

        Assert.assertEquals("İsimler eşleşmiyor", randomName, savedName);
        Assert.assertEquals("Soyisimler eşleşmiyor", randomSurname, savedSurname);
        Assert.assertEquals("Yaşlar eşleşmiyor", randomAge, savedAge);
        Assert.assertEquals("Meslekler eşleşmiyor", randomJob, savedJob);
        Assert.assertEquals("Şehirler eşleşmiyor", randomCity, savedCity);


    }

    @Then("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }

    @Then("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() {


    }

    @Then("gelir ekle bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin() {

    }

    @Then("aciklama,gelir tip, kategori, tarih ve tutari belirleyin ve kaydedin")
    public void aciklama_gelir_tip_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin() {

    }

    @Then("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {

    }


}
