package com.solvd.carinanative.page.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class LoginPage extends AbstractPage {

    @FindBy(xpath = "//android.widget.EditText[contains (@content-desc, 'test-Password')]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.widget.EditText[contains (@content-desc, 'test-Username')]")
    private ExtendedWebElement userNameInput;

    @FindBy(xpath = "//android.view.ViewGroup[contains (@content-desc, 'test-LOGIN')]")
    private ExtendedWebElement loginButton;

    private By errorMessage = By.xpath("//android.view.ViewGroup[contains (@content-desc, 'test-Error message')]//android.widget.TextView");
    private By lockedOutErrorMessage = By.xpath("//android.view.ViewGroup[contains (@content-desc, 'test-Error message')//android.widget.TextView[contains (@text, 'locked out')]");

    public LoginPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(loginButton);
    }

    public ProductsPage login(String userName, String password) {
            userNameInput.type(userName);
            passwordInput.type(password);
            loginButton.click();
            return initPage(getDriver(), ProductsPage.class);
    }

    public boolean isErrorMessageDisplayed() {
        return findExtendedWebElement(errorMessage).isDisplayed();
    }

    public String getErrorMessageText() {
        return findExtendedWebElement(errorMessage).getAttribute("text");
    }

}
