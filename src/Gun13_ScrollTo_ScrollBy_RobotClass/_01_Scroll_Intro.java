package Gun13_ScrollTo_ScrollBy_RobotClass;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scroll_Intro extends BaseDriver {

    @Test
    public void Test1()
    {

        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(2);
// JavaScript komutlarını çalıştırmak için önce JS değişkeni tanımlandı.
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000)");

        // (0-3000) -> (x,Y) sayfayı sağa x kadar ve aşağı y kadar kaydır.
        // 3000 px kadar aşağı kaydıracak.

        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0, -3000)");

        //scrollTo : verilen pixele kadar gider
        //scrollBy : verilen kadar daha ileri gider.

        MyFunc.Bekle(5);
        driverBekleKapat();

    }
}
