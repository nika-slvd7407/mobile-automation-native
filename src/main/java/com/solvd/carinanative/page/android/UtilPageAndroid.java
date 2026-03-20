package com.solvd.carinanative.page.android;

import com.solvd.carinanative.page.common.UtilsPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UtilsPage.class)
public class UtilPageAndroid extends UtilsPage {
    public UtilPageAndroid(WebDriver driver) {
        super(driver);
    }
}
