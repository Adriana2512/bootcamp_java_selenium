package ejercicios;
import java.io.*;
import java.util.concurrent.TimeUnit;
import utils.WebDriverFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumHandsOnAdriana2 {

    public static void main(String...args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.gr/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       assert  driver.getCurrentUrl().equals("https://www.google.gr/"): "La pagina no es la indicada";
       WebElement searchbox = ((ChromeDriver) driver).findElementByName("q");
       searchbox.sendKeys("Testing");
       searchbox.submit();
       driver.close();


    }
}
