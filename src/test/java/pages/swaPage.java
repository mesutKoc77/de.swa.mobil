package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.time.Month;

public class swaPage {



    public swaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='WEITER']")
    public MobileElement weiterButton;

    @FindBy(xpath = "//*[@resource-id='de.swa.mobil:id/onboardingForwardButton' and @text=concat('LOS GEHT', \"'\", 'S')]\n")
    public MobileElement losgehtButton;

    @FindBy(xpath = "//*[@text='BEI NUTZUNG DER APP']")
    public MobileElement allowLocationButton;

    @FindBy(id = "dashboard_deutschland_ticket")
    public MobileElement deutschlandTicketButton;
    @FindBy(id = "com.android.chrome:id/close_button")
    public MobileElement closeButton;
    @FindBy(xpath = "//*[@text='Tickets']")
    public MobileElement ticketsButton;















}
