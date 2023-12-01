package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;

public class BrowserQuality {

    public BrowserQuality (){
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy (xpath = "//*[text()=\"Accept\"]")
    public WebElement cookies;

    @FindBy (xpath = "//*[@class='mobile-nav-trigger']")
    public WebElement hamburgerMenu;

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy (xpath = "//*[text()='Provide your valid login credentials']")
    public WebElement isLogin;

    @FindBy(xpath="//*[@id='login-email']")
    public WebElement mailField;

    @FindBy(xpath="//*[@id='login-password']")
    public WebElement passwordField;

    @FindBy(xpath="(//*[text()='Login'])[2]")
    public WebElement submitLoginButton;






    /*

     */
}
