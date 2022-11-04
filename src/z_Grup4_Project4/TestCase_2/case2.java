package z_Grup4_Project4.TestCase_2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class case2 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
        eBookAddtoCart.click();

        driver.switchTo().frame(5);
        MyFunc.Bekle(2);
        WebElement debitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        debitCard.click();
        MyFunc.Bekle(2);
        WebElement pay = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        pay.click();
        MyFunc.Bekle(2);

        WebElement allert=driver.findElement(By.cssSelector("[class='Close-SnackBar md hydrated']~span"));
        Assert.assertTrue("Invalid promo code yazısının görüldü mü ?: ", allert.getText().contains("Invalid Email\n" +
                "Invalid Email\n" +
                "Invalid Billing Name"));

        driverBekleKapat();

    }
}