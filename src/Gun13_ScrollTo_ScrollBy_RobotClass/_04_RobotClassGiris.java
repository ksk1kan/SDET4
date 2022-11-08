package Gun13_ScrollTo_ScrollBy_RobotClass;

import Utility.BaseDriver;
import Utility.MyFunc;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_RobotClassGiris extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        //MyFunc.Bekle(2);

        Robot rbt = new Robot();

        for (int i=0 ; i<21; i++)
        {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);




        // ----> POP UP KAPATMA BÖLÜMÜ <-----
        for (int i=0 ; i<4; i++)
        {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }
//
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        driverBekleKapat();

    }
}