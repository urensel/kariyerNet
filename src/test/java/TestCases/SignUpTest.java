package TestCases;

import Listener.Listener;
import Locators.SignUp.SignUpDatas;
import Locators.SignUp.SignUpElements;
import TestCaseFunc.SignUpFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SignUpTest extends BaseTest {

    SignUpElements signUpElementsTest = new SignUpElements();
    SignUpDatas signUpDatasTest = new SignUpDatas();

    @Test
    public void signUp() {
        SignUpFunc signUpFunc = new SignUpFunc(driver);
        signUpFunc.signUp();
    }

    @Test
    public void checkAllFunction() {
        SignUpFunc checkFunc = new SignUpFunc(driver);
        checkFunc.fillInputFunc(signUpElementsTest.inputName, signUpDatasTest.name);
        checkFunc.fillInputLastNameFunc();
        checkFunc.fillInputMailFunc();
        checkFunc.fillInputPasswordFunc();
        checkFunc.clickCheckboxesFunc();
        checkFunc.clickSignUpFunc();
        checkFunc.checkGoogleAnalyticsFunc();
    }

    @Test
    public void checkMandatory() {
        SignUpFunc checkMandatory = new SignUpFunc(driver);
        checkMandatory.clickSignUpFunc();
        checkMandatory.checkMandatoryTextFunc(signUpElementsTest.mandatoryName, signUpDatasTest.mandatoryNameTxt);
        checkMandatory.checkMandatoryTextFunc(signUpElementsTest.mandatoryLastName, signUpDatasTest.mandatoryLastNameTxt);
        checkMandatory.checkMandatoryTextFunc(signUpElementsTest.mandatoryMail, signUpDatasTest.mandatoryEmailTxt);
        checkMandatory.checkMandatoryPasswordFunc();
    }
}
