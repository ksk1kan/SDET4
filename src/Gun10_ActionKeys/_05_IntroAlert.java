package Gun10_ActionKeys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_IntroAlert extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);

        driver.switchTo().alert().accept(); // alert kutucuğuna geçip onay işlemi gönderir
        //okay tıklanıldığı anda gidilen ana sayfa üzerine geri döner ve bekler/sonraki işleme geçer/kapatır v.s

        MyFunc.Bekle(2);


        driverBekleKapat();




    }
}
