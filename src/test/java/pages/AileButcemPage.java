package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

}
