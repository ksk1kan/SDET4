package Gun04_FindingElement;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Utility/chromedriver.exe");
        WebDriver driver = new ChromeDriver();   // web sayfasını kontrol eden görevli
        driver.get("https://www.techno.study/"); // web sayfasını aç



        MyFunc.Bekle(5);
        driver.quit();
    }
}
