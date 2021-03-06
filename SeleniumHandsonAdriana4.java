package ejercicios;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import utils.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsonAdriana4 {
    public static void main (String...args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Selenium");
        search.submit();
        Thread.sleep(10000);
        driver.close();

    }
}

