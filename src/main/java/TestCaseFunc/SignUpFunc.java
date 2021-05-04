package TestCaseFunc;

import Locators.SignUpElements;
import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpFunc extends BasePage {
    public SignUpFunc(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    SignUpElements signUpElements = new SignUpElements();

    public void signUp(){
        sendKeys(signUpElements.inputName, name);
        sendKeys(signUpElements.inputLastName, lastName);
        sendKeys(signUpElements.inputMail, mail);
        sendKeys(signUpElements.inputPassword, password);
        element(signUpElements.checkboxServiceContact).click();
        element(signUpElements.confirmCheckboxDialog).click();
        element(signUpElements.checkboxCommunicationContract).click();
        element(signUpElements.checkboxExplicitConsentContract).click();
        element(signUpElements.confirmCheckboxDialog).click();
        executor.executeScript("arguments[0].click();", element(signUpElements.registerUserButton));
        Assert.assertTrue(list(signUpElements.googleAnalytics).size() > 0);
    }

    public void fillInputNameFunc(){
        sendKeys(signUpElements.inputName, name);
    }
    public void fillInputLastNameFunc(){
        sendKeys(signUpElements.inputLastName, lastName);
    }
    public void fillInputMailFunc(){
        sendKeys(signUpElements.inputMail, mail);
    }
    public void fillInputPasswordFunc(){
        sendKeys(signUpElements.inputPassword, password);
    }
    public void clickCheckboxesFunc(){
        element(signUpElements.checkboxServiceContact).click();
        element(signUpElements.confirmCheckboxDialog).click();
        element(signUpElements.checkboxCommunicationContract).click();
        element(signUpElements.checkboxExplicitConsentContract).click();
        element(signUpElements.confirmCheckboxDialog).click();
    }
    public void clickSignUpFunc(){
        executor.executeScript("arguments[0].click();", element(signUpElements.registerUserButton));
    }
    public void checkGoogleAnalyticsFunc(){
        Assert.assertTrue(list(signUpElements.googleAnalytics).size() > 0);
    }

}
