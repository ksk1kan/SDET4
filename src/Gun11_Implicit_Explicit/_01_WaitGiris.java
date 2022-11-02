package Gun11_Implicit_Explicit;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitGiris extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"));
        btn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); // önce 5-10-15 sn yaptık sonra 120 yaptık.
        //genellikle 30 sn konuluyor.

        WebElement txtElement = driver.findElement(By.xpath("//p[text()='WebDriver']"));



    }
}