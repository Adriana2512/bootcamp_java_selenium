package ejercicios;

import utils.WebDriverFactory;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {

    public static void main(String...args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.gr/");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebElement element= driver.findElement(By.id("test"));
        driver.close();
    }
}
