package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    private static AndroidDriver<MobileElement> browserDriver;

    public static AndroidDriver getBrowserDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (browserDriver == null) {

            DesiredCapabilities caps =new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL2");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.NO_RESET,false);
            caps.setCapability("chromedriverExecutable","/Users/mesut/IdeaProjects/AppiumCucumber_T113/Driver/chromedriver");
            //eger calismazsa buradaki path ile ilgili cep telefonumuzdaki chrome in  surumunu buradan gosterebiliriz.
            //yani Emulator asagidaki Driver i calistiramzsa benim kendisine yolunu verdigim Path ile gitsin calistirsin
            //
            caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome"); // kullanacak oldugumuz mobil browser tanimi

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                browserDriver = new AndroidDriver<>(appiumServerURL,caps);
                browserDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }else {

                throw new UnsupportedOperationException("Invalid Platform Name ");

            }

        }

        return browserDriver;
    }


    public static void quitAppiumDriver(){
        if (browserDriver != null) {
            browserDriver.quit();
            browserDriver = null;
        }
    }
}