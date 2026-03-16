package com.solvd.carinanative.page.ios;

import com.solvd.carinanative.page.common.UtilsPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = UtilsPage.class)
public class UtilPageIOS extends UtilsPage {
    public UtilPageIOS(WebDriver driver) {
        super(driver);
    }
}
