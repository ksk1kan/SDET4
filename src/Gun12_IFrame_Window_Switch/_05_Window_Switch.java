package Gun12_IFrame_Window_Switch;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_Window_Switch extends BaseDriver {

    /*
    Senaryo:
    https://www.selenium.dev/ adresinde ki ayrı tab'da açılan linklere tıklatınız.
    Açılan bütün yeni tab'larda ki sayfaların tittle ve url'lerini yazdırınız.
    Daha sonra ana sayfaya dönünüz.

    ipucu : driver.switchTo().windows(id) ile istenilen tab'a geçiş yapılır.

     */

    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/");

        String anaSayfaWindowID=driver.getWindowHandle();  // bulunduğum sayfanın/windowun id'sini bana verir.
        System.out.println("anaSayfaWindowID = " + anaSayfaWindowID);



        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler)
            if(!link.getAttribute("href").contains("mailto"))
                link.click();

        Set<String> windowIdler=driver.getWindowHandles();
        for (String id: windowIdler) {
            driver.switchTo().window(id);  // diğer tab'a geçiş yaptık

            System.out.println(id+" - Title: "+driver.getTitle()+" -url: "+driver.getCurrentUrl());
        }

        // TODO : her bir sayfayı ayrı ayrı kapatın.
        //burada önce ana sayfaya geçiş yapalım.
        driver.switchTo().window(anaSayfaWindowID);

        // TODO : anasayfa harici kapanacak.
        //sonra anasayfa harici diğerlerini kapatalım.
        for (String id : windowIdler)
        {
            if (id.equals(anaSayfaWindowID))
                continue;  // sadece bu adımı pas geçti. kendinden sonra gelenleri çalıştırmadı.

            driver.switchTo().window(id); // diğer tab'a geçip kapatır.
            driver.close();
        }


        MyFunc.Bekle(10);
        driverBekleKapat();

    }
}


