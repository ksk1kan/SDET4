package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoXPath extends BaseDriver {

    @Test
    public void Test1()
    {
//        (//*[@class='input_error form_input'])[1]
//         //*[@placeholder='Username']
//        //*[text()='Accepted usernames are:']
//
//        //*[text()='Accepted usernames are:']/..

        //WebElement element=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[1]/input"));
        //uzun path oldugundan kullanışsız hem yazım zorluğu ve hem de yolun bozulma ihtimali çok yüksek : ABSOLUTE XPATH

        //WebElement element=driver.findElement(By.xpath("//input[@id='user-name']" )); // Relative XPath

        driver.get("https://www.saucedemo.com/");



    }

}
