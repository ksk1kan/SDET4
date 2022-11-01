package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Utility/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");

    }
}
