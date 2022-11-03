package Gun12_IFrame_Window_Switch;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_IFramelerGecis extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  // frame1'in id ve name webelement geçişi çok yavaş.
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        // şu an grame1 ile gösterilen sayfadayız. Diğer frame2 veya 3 veya ilk sayfamızda ki
        //locator'ları bulamayız. Çünkü driver şu an da frame1 isimli sayfayı DRIVE etmekte.

        // 1-) driver.switchTo().frame(0);  // --> içinde ki frame3'e geçiş yapar.
        // 2-) driver.swtichTo().parentFrame(); // --> bir önce ki sayfaya geri döner.
        // 3-) driver.switchTo().defaultContent(); // --> hangi sayfada olursan ol ilk sayfaya direkt geçiş yaptırır.
        // geri geri geçişlerde index'e gerek kalmaz ! 2 ve 3. madde için geçerli.




        driverBekleKapat();

    }

}