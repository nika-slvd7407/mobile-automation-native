package com.solvd.carinanative.page.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class LoginPage extends AbstractPage {

    @FindBy(xpath = "//android.widget.EditText[contains (@content-desc, 'test-Password')]")
    ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.widget.EditText[contains (@content-desc, 'test-Username')]")
    ExtendedWebElement userNameInput;

    @FindBy(xpath = "//android.view.ViewGroup[contains (@content-desc, 'test-LOGIN')]")
    ExtendedWebElement loginButton;

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

}
