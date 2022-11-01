package Gun10_ActionKeys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionSendKeys_TusKontrol extends BaseDriver {

    @Test
            public void Test()
    {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
                .moveToElement(element)   // kutucuğa git
                .click()   // kutucuğa tıkla
                .keyDown(Keys.LEFT_SHIFT)  // keylerden SHIFT'i seç
                .sendKeys("a")  // tuşlardan a'ya bas
                .keyUp(Keys.SHIFT)  //keylerden SHIFT'i bırak
                .sendKeys("hmet")  //istediğin kelimeleri yaz
                .build(); //bu durumu hazırla.

        MyFunc.Bekle(2);

        aksiyon.perform();  // yukarıdaki durumu işleme dök.



        driverBekleKapat();

    }
}
