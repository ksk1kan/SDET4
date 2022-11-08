package Gun14_RobotClass_Screenshots;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _01_RobotClass_Upload extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        //MyFunc.Bekle(2);

        Robot rbt = new Robot();

        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(0);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // bilgisayarda ki dosyanın path'ini dosya adının olduğu yeter yapıştırmak gerekiyor.
        // önce dosyanın/path yolunu hafızaya kopyalayıp sonra ctrl+v ile açılan popup'ın dosya adı bölümüne yapıştırmak gerekiyor.

        // PATH hafızaya alındı.
        StringSelection selection = new StringSelection("C:\\Users\\BAF\\IdeaProjects\\TestingTools\\src\\Gun14_\\ornek");

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection,selection);
        MyFunc.Bekle(1);

        // CTRL + V bastırma
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        MyFunc.Bekle(1);
        // CTRL + V bıraktırma
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        //MyFunc.Bekle(2);

        WebElement chcBox = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        chcBox.click();

        //MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded."));



        driverBekleKapat();

    }
}