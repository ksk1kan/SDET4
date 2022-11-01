package Gun05_FindingElement_Navigating;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        // history açısından get ile navigate.to arasında bir fark yok
        // sayfanın yüklenmesi açısından get tam yüklemeyi bekler, hatta bunun için süre sınırı koyuldu.
        // navigate.to ise tam yüklemeyi beklemez.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // web sayfası açma komutu
        MyFunc.Bekle(3);
        WebElement element= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); // o anda bulunğum URL veriyor.

        MyFunc.Bekle(3);
        driver.navigate().back(); // tarayıcı history isinden geri geldim.

        System.out.println(driver.getCurrentUrl()); // o anda bulunğum URL veriyor.

        MyFunc.Bekle(3);
        driver.navigate().forward(); // tarayıcı history isinden ileri gittim.

        System.out.println(driver.getCurrentUrl()); // o anda bulunğum URL veriyor.

        driverBekleKapat();
    }
}
