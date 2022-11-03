package Gun12_IFrame_Window_Switch;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrame_Soru extends BaseDriver {
    /*
       1-driver.get("http://chercher.tech/practice/frames); sayfasına gidiniz.
       2-Inputa ülke adı yazınız
       3-CheckBox ı çekleyiniz.
       4-Select in 4.elemanını seçiniz.
     */
    @Test
    public void Test1(){

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);  // frame1'in id ve name webelement geçişi çok yavaş.
        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0); //frame1 içinde ki diğer frame'e geçiş yaptık.

        WebElement chkBox = driver.findElement(By.id("a"));  // //input[@id='a'] xpath ile de yapılabilir.
        chkBox.click();

        driver.switchTo().defaultContent();  // default frame'e dönüş sağlandı. ilk sayfa.

        driver.switchTo().frame(1);  // select'in olduğu frame(frame-2) ilk sayfada ki 2. yani index olarak
                                            // 1 frame.
        WebElement menu=driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu);
        ddMenu.selectByIndex(3); // 4 no'lu eleman seçildi. ddMenu.getOptions().size()-1 ile de seçtirilebilir.



        driverBekleKapat();

    }

}