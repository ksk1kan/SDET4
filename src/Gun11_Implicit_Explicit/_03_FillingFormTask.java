package Gun11_Implicit_Explicit;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

    /*
Bu siteye gidiniz. http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

    @Test
    public void Test1() {

                driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.xpath("//*[@id=\"title\"]"));
        name.sendKeys("Birkan");
        WebElement comment = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        comment.sendKeys("Selam Ekip :)");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"btn-submit\"]"));
        submit.click();

        // bu locator'da yer alan elementin text'i bu olana kadar bekle.
        WebDriverWait bekle = new WebDriverWait(driver,Duration.ofSeconds(5));
        bekle.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"submit-control\"]"),"Form submited Successfully!"));

        WebElement message = driver.findElement(By.xpath("//*[@id=\"submit-control\"]"));
        Assert.assertEquals("Form submited Successfully!",message.getText());

        driverBekleKapat();


    }
}
