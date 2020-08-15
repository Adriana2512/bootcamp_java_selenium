package ejercicios;

import org.openqa.selenium.*;
import utils.WebDriverFactory;

public class LocatorsExercise1 {

    public static void main (String...args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.mercadolibre.com.mx/");
        driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.name("as_word"));
        searchInput.sendKeys("PS4");
        WebElement searchButton = driver.findElement(By.className("nav-search-btn"));
        searchButton.click();
        WebElement product = driver.findElement(By.className("main-title"));
        product.click();
        driver.close();
    }
}
