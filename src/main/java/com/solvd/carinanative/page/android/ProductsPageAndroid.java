package com.solvd.carinanative.page.android;

import com.solvd.carinanative.page.common.ProductsPage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPage.class)
public class ProductsPageAndroid extends ProductsPage {
    public ProductsPageAndroid(WebDriver driver) {
        super(driver);
    }
}
