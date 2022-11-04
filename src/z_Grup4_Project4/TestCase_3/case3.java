package z_Grup4_Project4.TestCase_3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class case3 extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://shopdemo.e-junkie.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
        eBookAddtoCart.click();

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        MyFunc.Bekle(2);
        driver.switchTo().frame(frame);
        MyFunc.Bekle(2);
        WebElement debitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        debitCard.click();
        MyFunc.Bekle(10);

        WebElement iframe2 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));

        wait.until(ExpectedConditions.invisibilityOf(debitCard));
        driver.switchTo().frame(iframe2);

        WebElement cardNumberInput = driver.findElement(By.xpath("//span[@class='InputContainer']//input"));
        cardNumberInput.sendKeys("1111 1111 1111 1111");

        //WebElement allert=driver.findElement(By.xpath("//*[@id=SnackBar]"));
        //Assert.assertTrue("I: ", allert.getText().contains("Kart numaranız geçersiz."));

        driverBekleKapat();


    }
}