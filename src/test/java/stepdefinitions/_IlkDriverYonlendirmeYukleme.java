package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class _IlkDriverYonlendirmeYukleme {
    @Given("Kullanici Driver Kurulumunu yapar ve {string} {string} ile teste konu uygulamaya yonlendirir.")
    public void kullaniciDriverKurulumunuYaparVeIleTesteKonuUygulamayaYonlendirir(String AppPackage, String AppActivity) {
        Driver.APP_PACKAGE=ConfigReader.getProperty(AppPackage);
        Driver.APP_ACTIVITY= ConfigReader.getProperty(AppActivity);
        Driver.getAndroidDriver();

    }
}
