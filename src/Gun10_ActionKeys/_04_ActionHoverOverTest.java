package Gun10_ActionKeys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverOverTest extends BaseDriver {
    @Test
    public void Test1() {

        // isDisplay ve isEnable gibi kontroller, element HTML'in içinde var fakat görünür değil
        // durumunda kullanılır.
        // bazı durumlarda element HTML'in içerisinde hiç yoktur.
        // elementi bulamazsa implicity wait (basedriver) devreye girer ve verilen süre kadar bulmaya çalışır.

        // eğer çıkıyorsa aşağıdaki durumu yap !

        // List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accep]"));
        // if (cookiesAccept.size() > 0) //varsa
        //    cookiesAccept.get(0).click(); // kapat

        driver.get("https://www.etsy.com/");

        WebElement accessories = driver.findElement(By.id("catnav-primary-link-10855"));

        WebElement mucevher = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye = driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bibKolye).build().perform();
        MyFunc.Bekle(2);

        bibKolye.click();

        Assert.assertTrue("URL'de Bib Kolye Var mı?: ",driver.getCurrentUrl().contains("bib"));


        driverBekleKapat();


    }
}
