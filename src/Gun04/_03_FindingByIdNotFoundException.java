package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();   // web sayfasını kontrol eden görevli
        driver.get("https://form.jotform.com/221934510376353"); // web sayfasını aç

        try {
            WebElement element = driver.findElement(By.id("ismet"));
            System.out.println("element.getText() = " + element.getText());
        }
        catch(Exception ex){
            System.out.println("Eleman bulunmaadı = " + ex.getMessage());
        }

        MyFunc.Bekle(10);
        driver.quit();
    }
}
