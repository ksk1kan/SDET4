package z_Grup4_Project4.TestCase_5;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class case5 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement contact = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/a"));
        contact.click();

        MyFunc.Bekle(2);

        WebElement name = driver.findElement(By.cssSelector("[id='sender_name']"));
        name.sendKeys("Group4");

        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.cssSelector("[id='sender_email']"));
        eMail.sendKeys("Group4@gmail.com");

        MyFunc.Bekle(2);

        WebElement subject = driver.findElement(By.cssSelector("[id='sender_subject']"));
        subject.sendKeys("selamlar");

        MyFunc.Bekle(2);

        WebElement sendMessage = driver.findElement(By.cssSelector("[id='sender_message']"));
        sendMessage.sendKeys("Group4'den selamlar.");

        MyFunc.Bekle(2);

        WebElement senderButton = driver.findElement(By.cssSelector("[id='send_message_button']"));
        senderButton.click();

        MyFunc.Bekle(5);

        driver.switchTo().alert().accept();

        driverBekleKapat();

    }
}