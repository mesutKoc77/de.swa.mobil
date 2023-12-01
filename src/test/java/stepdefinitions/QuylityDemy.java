package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utilities.BrowserDriver;
import utilities.ReusableMethods;

public class QuylityDemy {

    AndroidDriver driver=BrowserDriver.getBrowserDriver();

    @Given("Kullanici qualiytdemy sayfasina gider")
    public void kullanici_qualiytdemy_sayfasina_gider() {
        driver.get("https://www.qualitydemy.com/");



    }
    @Given("Login e tiklayarak login sayfasina ulastigini dogrular")
    public void login_e_tiklayarak_login_sayfasina_ulastigini_dogrular() {

    }
    @Given("yanlis degerlerle siteye giris yapamadigini dogrular")
    public void yanlis_degerlerle_siteye_giris_yapamadigini_dogrular() {


    }

    @Given("Kullanici Cookiesöeri kabul eder")
    public void kullanici_cookiesöeri_kabul_eder() {



    }

}
