package z_Grup4_Project4.TestCase_1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class case1 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
        eBookAddtoCart.click();

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement addPromoCode = driver.findElement(By.cssSelector("[class='Apply-Button Show-Promo-Code-Button']"));
        MyFunc.Bekle(2);
        addPromoCode.click();
        MyFunc.Bekle(1);
        WebElement promoCode = driver.findElement(By.cssSelector("input[class='Promo-Code-Value']"));
        MyFunc.Bekle(2);
        promoCode.click();
        MyFunc.Bekle(1);
        promoCode.sendKeys("Grup4");
        WebElement applyButton = driver.findElement(By.cssSelector("button[class='Promo-Apply']"));
        applyButton.click();

        MyFunc.Bekle(2);
        WebElement snapBar=driver.findElement(By.cssSelector("div[id='SnackBar']"));
        Assert.assertTrue("Invalid promo code yazısının görüldü mü ?: ", snapBar.getText().contains("Invalid promo code"));


        driverBekleKapat();
    }
}
