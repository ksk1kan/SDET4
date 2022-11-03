package Gun12_IFrame_Window_Switch;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/");

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler)
            if(!link.getAttribute("href").contains("mailto"))
            link.click();

        Set<String> windowIdler=driver.getWindowHandles(); //açık olan bütün sayfaların id'lerini bize verir
                                                            //get.WindowHandle ise bulunulan yani aktif olan sayfanın/window'un id'sini verir.
        for (String id: windowIdler)
            System.out.println("id = " + id);


        MyFunc.Bekle(5);
        driverBekleKapat();


    }
}
