package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BrowserQuality;
import utilities.*;

import java.awt.event.KeyEvent;
import java.time.Duration;

public class QuylityDemy {
    BrowserQuality browserQuality = new BrowserQuality();


    AndroidDriver driver = BrowserDriver.getBrowserDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());

    @Given("Kullanici qualiytdemy sayfasina gider")
    public void kullanici_qualiytdemy_sayfasina_gider() {
        driver.get("https://www.qualitydemy.com/");


    }

    @Given("Login e tiklayarak login sayfasina ulastigini dogrular")
    public void login_e_tiklayarak_login_sayfasina_ulastigini_dogrular() {

        wait.until(ExpectedConditions.visibilityOf(browserQuality.cookies)).click();
        wait.until(ExpectedConditions.visibilityOf(browserQuality.hamburgerMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(browserQuality.login)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(browserQuality.isLogin)).isDisplayed());


    }

    @Given("yanlis degerlerle {string} {string} siteye giris yapamadigini dogrular")
    public void yanlis_degerlerle_siteye_giris_yapamadigini_dogrular(String mail, String sifre) throws InterruptedException {
        Thread.sleep(2);
        browserQuality.mailField.sendKeys(ConfigReader.getProperty(mail));
        Thread.sleep(2);
        browserQuality.passwordField.sendKeys(ConfigReader.getProperty(sifre));
        Thread.sleep(2);
        browserQuality.submitLoginButton.click();


    }

    @Given("Kullanici Cookiesöeri kabul eder")
    public void kullanici_cookiesöeri_kabul_eder() {


    }

}
