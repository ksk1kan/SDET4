package Gun10_ActionKeys;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_DragAndDropBy extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        //2. surgu    div[id='slider-range']>:nth-child(3)
        // solSurgu.getSize().width()
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.dragAndDropBy(solSurgu,-101,0).build();
        MyFunc.Bekle(2);

        Action aksiyon2 = aksiyonlar.dragAndDropBy(solSurgu,200,0).build();
        MyFunc.Bekle(2);

        aksiyon.perform();
        aksiyon2.perform();

        driverBekleKapat();






    }
}
