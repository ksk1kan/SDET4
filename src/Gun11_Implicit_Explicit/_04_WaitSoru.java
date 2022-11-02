package Gun11_Implicit_Explicit;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {

   /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test1() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("https://www.demoblaze.com/index.html");

        WebElement s6 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
        s6.click();
        WebElement addChart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        addChart.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(15));
        bekle.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement homePage = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        homePage.click();


        driverBekleKapat();


    }
}
