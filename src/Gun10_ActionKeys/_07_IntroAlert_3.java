package Gun10_ActionKeys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_IntroAlert_3 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
        clickMe1.click();

        MyFunc.Bekle(2);
        driver.switchTo().alert().sendKeys("Birkan");
        driver.switchTo().alert().accept();

        MyFunc.Bekle(2);

        WebElement txtActual= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Beklenen Yazı Görülmedi. ",txtActual.getText().contains("Birkan"));

        driverBekleKapat();



    }
}
