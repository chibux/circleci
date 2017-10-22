package google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Rob on 10/9/2017
 */
public class TestGoogleSearch {
    @Test
    public void testGoogleSearch() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("http://google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Selenium" + Keys.ENTER);
        Assert.assertEquals("Selenium - Google Search", driver.getTitle());
        System.out.println("TEST PASSED! CLOSING THE BROWSER");
        driver.quit();
    }
}