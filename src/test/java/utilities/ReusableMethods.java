package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public  class ReusableMethods {

    static TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());

    public static void koordinatTiklama(int xKoordinat,int yKoordinat,int bekleme) throws InterruptedException {
        TouchAction touchAction=new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat,yKoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void koordinatTiklama(int x, int y) {
        touchAction.press(PointOption.point(x, y)).release().perform();
        WaitHelper.sleep(1);

    }

    public static void belliSayiIleEkranKaydirma(
                                          int startX, int startY,
                                          int endX, int endY,
                                          long waitTimeMillis,
                                          int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            touchAction
                    .press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(waitTimeMillis)))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }
    }

    public static void scroll(int startX, int startY, int endX, int endY) {
        touchAction
                .press(PointOption.point(startX, startY))  // Başlangıç koordinatları
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))  // 1 saniye bekleyin
                .moveTo(PointOption.point(endX, endY))  // Bitiş koordinatları
                .release()  // Bırak
                .perform();  // İşlemi gerçekleştir
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver)  Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();

    }

    public static void BrowserScrollWithUiScrollable(String elementText) {


    }





    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhssmm").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot)Driver.getAndroidDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void clickElementByJS(WebElement element) {

    }

    public boolean isToastMessageDisplayed(String message, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getAndroidDriver(), Duration.ofSeconds(timeout).getSeconds());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='text1' and @text='" + message + "']")));
            return true;
        } catch (Exception e) {
            return false;
        }
        //asagi ile de assert edersin.
     // Assert.assertTrue(isToastMessageDisplayed("Başarılı"));
    }



}
