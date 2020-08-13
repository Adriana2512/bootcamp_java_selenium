package ejercicios;
import utils.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

public class SeleniumHandsonAdriana3 {

    public static void main (String...args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("adriana.benitez.bustos@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456");
        WebElement login = driver.findElement(By.id("pass"));
        login.click();
        driver.close();
    }
}
