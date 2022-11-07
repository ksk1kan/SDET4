package Gun13_ScrollTo_ScrollBy;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");
        MyFunc.Bekle(5);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll'u bir element'e kadar yani o pencere içerisinde ki görünene kadar nasıl kaydırabiliriz ?

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/main/div[10]/div/div/div[1]/a/div[1]"));

        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[10]/div/div/div[1]/a/div[1]")));

        MyFunc.Bekle(3);
        js.executeScript("(arguments[0].click);", element);


        MyFunc.Bekle(3);
        driverBekleKapat();



    }
}
