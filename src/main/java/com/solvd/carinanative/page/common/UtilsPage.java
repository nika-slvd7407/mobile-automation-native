package com.solvd.carinanative.page.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UtilsPage extends AbstractPage implements IMobileUtils {

    public UtilsPage(WebDriver driver) {
        super(driver);
    }
}
