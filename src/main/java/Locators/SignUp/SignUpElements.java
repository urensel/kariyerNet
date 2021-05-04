package Locators.SignUp;

import org.openqa.selenium.By;

public class SignUpElements {

    public By inputName = By.name("name");
    public By inputLastName = By.name("lastname");
    public By inputMail = By.name("email");
    public By inputPassword = By.name("password");
    public By checkboxServiceContact = By.cssSelector("#register-form > div.checkboxes.mobile-checkboxes > div:nth-child(1)");
    public By confirmCheckboxDialog = By.id("btnModalYesCallback");
    public By checkboxCommunicationContract = By.cssSelector("#register-form > div.checkboxes.mobile-checkboxes > div:nth-child(2)");
    public By checkboxExplicitConsentContract = By.cssSelector("#register-form > div.checkboxes.mobile-checkboxes > div:nth-child(3)");
    public By registerUserButton = By.className("btn-submit");
    public By googleAnalytics = By.cssSelector("script[src*='https://www.google-analytics.com/']");

    public By mandatoryName = By.id("name-error");
    public By mandatoryLastName = By.id("lastName-error");
    public By mandatoryMail = By.id("email-error");
    public By mandatoryPassword = By.id("password-error");
}


