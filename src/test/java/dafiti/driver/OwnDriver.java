package dafiti.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OwnDriver {
    private static AndroidDriver driver;

    public static WebDriver initDriver(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "128d90340507");
        desiredCapabilities.setCapability("appActivity", "br.com.dafiti.activity.SplashSelectCountry_");
        desiredCapabilities.setCapability("appPackage", "br.com.dafiti");
        desiredCapabilities.setCapability("noReset", "false");
        try {
            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723/wd/hub"),
                    desiredCapabilities);
        }catch (MalformedURLException exception){
            exception.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
