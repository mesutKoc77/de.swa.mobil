package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage() {
        // AppiumFieldDecorator ile PageFactory'nin başlatılması
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text=\"E-mail Adresi\"]")
    public MobileElement emailField;

    @FindBy(xpath = "//*[@text=\"Şifre\"]")
    public MobileElement passwordField;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='text1' and @text='Başarılı']")
    public MobileElement toastMessage;

    @FindBy(xpath = "//android.view.ViewGroup[contains(@bounds, '[79,108][430,155]')]\n")
    public MobileElement hamburgerMenu;

    @FindBy(xpath = "(//*[@index='0'])[17]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@index='1'])[5]")
    public MobileElement surnameBox;

    @FindBy(xpath = "//android.widget.ImageView[contains(@bounds, '[99,1657][152,1709]')]")
    public MobileElement kafaField;

    @FindBy(xpath = "(//android.widget.TextView[contains(@index, '0')])[2]")
    public MobileElement kaydetField;

    @FindBy(xpath = "//*[@index='4']")
    public MobileElement ageBox;
    @FindBy(xpath = "//*[@text='Başarılı']")
    public MobileElement basariliBox;

    @FindBy(xpath = "//*[@index='5']")
    public MobileElement jobBox;

    @FindBy(xpath = "(//*[@index='2'])[2]")
    public MobileElement cityBox;









//kalan 50
}
