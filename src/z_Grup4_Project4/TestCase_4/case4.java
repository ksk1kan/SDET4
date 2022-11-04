package z_Grup4_Project4.TestCase_4;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class case4 extends BaseDriver {

    @Test
    public void Test1(){

            driver.get("https://shopdemo.e-junkie.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            // **** ADD TO CHART

            WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
            eBookAddtoCart.click();

            // **** FRAME1

            WebElement frame = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
            MyFunc.Bekle(2);
            driver.switchTo().frame(frame);
            MyFunc.Bekle(2);

            // **** DEBIT CARD DETAYLARI

            MyFunc.Bekle(5);
            WebElement debitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
            debitCard.click();
            MyFunc.Bekle(5);

              // **** E-MAIL ADRES DETAYLARI

            WebElement eMail = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input"));
            eMail.click();
            eMail.sendKeys("grup4@gmail.com");

            MyFunc.Bekle(1);

            WebElement confeMail = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[2]/input"));
            confeMail.click();
            confeMail.sendKeys("grup4@gmail.com");

            MyFunc.Bekle(1);

            WebElement cardHolderName = driver.findElement(By.cssSelector("input[placeholder='Name On Card']"));
            cardHolderName.click();
            cardHolderName.sendKeys("Grup4 Burada");

            MyFunc.Bekle(1);

            WebElement phone = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[4]/input"));
            phone.click();
            phone.sendKeys("476874287232");

            MyFunc.Bekle(1);

            WebElement company = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[5]/input"));
            company.click();
            company.sendKeys("TechnoStudy Group4 Comp.");

            MyFunc.Bekle(1);

            WebElement iframe2 = driver.findElement(By.xpath("//div[@class='__PrivateStripeElement']//iframe"));

            wait.until(ExpectedConditions.invisibilityOf(debitCard));
            driver.switchTo().frame(iframe2);

            WebElement cardNumberInput = driver.findElement(By.xpath("//span[@class='InputContainer']//input"));
            cardNumberInput.sendKeys("4242 4242 4242 4242");

            MyFunc.Bekle(3);

            //driver.switchTo().alert().dismiss();

            WebElement expDate = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input"));
            expDate.click();
            expDate.sendKeys("1222");

            MyFunc.Bekle(3);

            WebElement cvc = driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[3]/span/span/input"));
            cvc.click();
            cvc.sendKeys("000");

            MyFunc.Bekle(10);

            //WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/button[2]"));
            //clickButton.click();

            //WebElement allert=driver.findElement(By.xpath("//*[@id=SnackBar]"));
            //Assert.assertTrue("I: ", allert.getText().contains("Kart numaranız geçersiz."));

            driverBekleKapat();

    }
}