package Gun14_RobotClass_Screenshots;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class _02_RobotClass_Upload_2 extends BaseDriver {
    @Test
    public void Test1 () throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        WebElement input = driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\BAF\\IdeaProjects\\TestingTools\\src\\Gun14_\\ornek");

        WebElement chcBox = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        chcBox.click();


        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded."));



        driverBekleKapat();


    }
}