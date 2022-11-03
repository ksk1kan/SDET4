package Gun12_IFrame_Window_Switch;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_IFrameGiris extends BaseDriver {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra select in seçeneklerinden animals ı seçiniz.
 */

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  // frame1'in id ve name webelement geçişi çok yavaş.
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        // driver.switchTo().parentFrame();  // 1 kademe içeride olduğundan yine default page'e ulaşıyor.
        driver.switchTo().defaultContent();  // default page'e yani asıl giriş sayfasına ulaştı.

        driver.switchTo().frame(1); // ana sayfada ki 2. frame (index olarak 1) ulaşıldı. Burası select'in olduğu yer.


        WebElement menu=driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu);
        ddMenu.selectByVisibleText("Avatar");


        driverBekleKapat();

    }

}
