package Gun14_RobotClass_Screenshots;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _03_EkranKaydet extends BaseDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        MyFunc.Bekle(1);
        WebElement name=driver.findElement(By.name("username"));
        name.sendKeys("admin");

        MyFunc.Bekle(1);
        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("123");//invalid pass

        MyFunc.Bekle(1);
        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        MyFunc.Bekle(1);
        List<WebElement> hataMesaji= driver.findElements(By.cssSelector("div[role='alert']"));
        if (hataMesaji.size() > 0 )
        {
            System.out.println("Login Olunamadı, Hata Mesaji Göründü: ");

            //1. aşama : ekran görüntüsü alma değişkeni tanımlandı.
            TakesScreenshot ts = (TakesScreenshot) driver;
            //2. aşama : ekran görüntüsü alındı, hafızada saklıyor şu an.
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE);
            //3. aşama :
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png"));

            // TODO : her hatada farklı dosya kaydetmesi için ne yapmak lazım ?
        }


        MyFunc.Bekle(1);
        driverBekleKapat();



    }
}
