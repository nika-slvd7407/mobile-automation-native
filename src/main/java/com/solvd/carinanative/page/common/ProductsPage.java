package com.solvd.carinanative.page.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//android.widget.TextView[contains (@text, 'PRODUCTS')] ")
    private ExtendedWebElement title;

    public ProductsPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(title);
    }
}
