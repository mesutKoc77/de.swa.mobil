package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserDriver;
import utilities.Driver;

public class BrowserStep {

    @Given("Kullanici Browser Driver Kurulumlarini gerceklestiriri")
    public void kullanici_browser_driver_kurulumlarini_gerceklestiriri() {
        BrowserDriver.getBrowserDriver();

    }

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        BrowserDriver.getBrowserDriver().get("https://www.amazon.com/");

    }

}
