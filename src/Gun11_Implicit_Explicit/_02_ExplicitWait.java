package Gun11_Implicit_Explicit;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {

    @Test
    public void Test1() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"));
        btn.click();

        WebDriverWait bekle = new WebDriverWait(driver,Duration.ofSeconds(13));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //element hem html de olana kadar, görünür olana kadar, her iki durum için de bekle.


        WebElement txtElement = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        driverBekleKapat();
    }
}