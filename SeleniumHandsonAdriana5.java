package ejercicios;
import org.openqa.selenium.*;
import utils.WebDriverFactory;

public class SeleniumHandsonAdriana5 {

    public static void main(String...args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get ("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("adriana.benitez.bustos@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("ttttt");
        WebElement login= driver.findElement(By.name("login"));
        login.click();
        Thread.sleep(10000);
        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("QA Minds");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.close();

    }
}
