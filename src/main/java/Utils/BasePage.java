package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

//  Login Bilgileri
    public static String name = "GururOrkun";
    public static String lastName = "Ürensel";
    public static String mail = "test_auto@automation.com";
    public static String password = "Qwerty12345";

// Ortak Fonksiyonlar
    public WebElement element(By locator){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);
    }
    public List<WebElement> list(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }
    public void sendKeys(By locator, String value){
        element(locator).sendKeys(value);
    }

}
