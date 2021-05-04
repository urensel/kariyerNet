package TestCaseFunc;

import Locators.SignUp.SignUpDatas;
import Locators.SignUp.SignUpElements;
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
    SignUpDatas signUpDatas = new SignUpDatas();

    public void signUp() {
        sendKeys(signUpElements.inputName, signUpDatas.name);
        sendKeys(signUpElements.inputLastName, signUpDatas.lastName);
        sendKeys(signUpElements.inputMail, signUpDatas.mail);
        sendKeys(signUpElements.inputPassword, signUpDatas.password);
        element(signUpElements.checkboxServiceContact).click();
        element(signUpElements.confirmCheckboxDialog).click();
        element(signUpElements.checkboxCommunicationContract).click();
        element(signUpElements.checkboxExplicitConsentContract).click();
        element(signUpElements.confirmCheckboxDialog).click();
        executor.executeScript("arguments[0].click();", element(signUpElements.registerUserButton));
        Assert.assertTrue(list(signUpElements.googleAnalytics).size() > 0);
    }

    public void fillInputFunc(By elem, String value) {
        sendKeys(elem, value);
    }

    public void fillInputLastNameFunc() {
        sendKeys(signUpElements.inputLastName, signUpDatas.lastName);
    }

    public void fillInputMailFunc() {
        sendKeys(signUpElements.inputMail, signUpDatas.mail);
    }

    public void fillInputPasswordFunc() {
        sendKeys(signUpElements.inputPassword, signUpDatas.password);
    }

    public void clickCheckboxesFunc() {
        element(signUpElements.checkboxServiceContact).click();
        element(signUpElements.confirmCheckboxDialog).click();
        element(signUpElements.checkboxCommunicationContract).click();
        element(signUpElements.checkboxExplicitConsentContract).click();
        element(signUpElements.confirmCheckboxDialog).click();
    }

    public void clickSignUpFunc() {
        executor.executeScript("arguments[0].click();", element(signUpElements.registerUserButton));
    }

    public void checkGoogleAnalyticsFunc() {
        Assert.assertTrue(list(signUpElements.googleAnalytics).size() > 0);
    }

    public void checkMandatoryTextFunc(By elem, String value) {
        Assert.assertEquals(element(elem).getText(), value);
    }

    public void checkMandatoryPasswordFunc() {
        Assert.assertEquals(element(signUpElements.mandatoryPassword).getText(), signUpDatas.mandatoryPasswordTxt);
    }
}
