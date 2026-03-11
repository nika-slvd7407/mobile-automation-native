package com.solvd.carinanative.page.android;

import com.solvd.carinanative.page.common.LoginPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPage.class)
public class LoginPageAndroid extends LoginPage {

    public LoginPageAndroid(WebDriver driver) {
        super(driver);
    }
}
